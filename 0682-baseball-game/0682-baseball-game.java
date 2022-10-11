class Solution {
    
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            
            if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                int x = st.peek();
                st.push(2*x);
            }else if(operations[i].equals("+")){
                int num1 = st.pop();
                int num2 = st.peek();
                st.push(num1);
                st.push(num1 + num2);
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
                      
        }
        int sum=0;
        while(!st.isEmpty()){
            sum += st.pop();
            
        }
        return sum;
    }
    }