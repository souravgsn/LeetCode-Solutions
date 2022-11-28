class Solution {
    public String thousandSeparator(int n) {
        if(n==0) return "0";
        if(n<1000) return n+"";

        String str=""+n;
        StringBuilder res=new StringBuilder();

        int count=0;
        for(int i=str.length()-1;i>=0;i--){

            res.append(str.charAt(i));
            count++;
            // oonly append '.' after count became 3.
            if(count ==3 && i!=0){
                res.append('.');
                count=0;
            }

        }

        return res.reverse().toString();
    }
}