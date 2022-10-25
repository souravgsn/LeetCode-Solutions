class MinStack {
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> min = new Stack<Integer>();

    
    public MinStack() { }
    
    public void push(int x) {
       
        st.push(x);
        if(min.size()==0 || x <= min.peek()){
            min.push(x);
        }
    }
    
    public void pop() {
        int x = st.pop();
        if(x == min.peek()){
            min.pop();
        }
        
    }

    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
