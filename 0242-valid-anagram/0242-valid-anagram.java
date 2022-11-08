class Solution {
    public boolean isAnagram(String s, String t) {
        
           int a=s.length();
        int b=t.length();
        
        if(a!=b){
            return false;
        }
        
        int[] arr=new int[26];
        
        for(int i=0;i<a;i++){
            char ch=s.charAt(i);
            int index=ch-'a';
            arr[index]++;
        }
        for(int i=0;i<b;i++){
            char ch=t.charAt(i);
            int index=ch-'a';
            arr[index]--;
        }
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}