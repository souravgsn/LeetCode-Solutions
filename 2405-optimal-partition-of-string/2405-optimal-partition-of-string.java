class Solution {
    public int partitionString(String s) {
        int count = 0;

        Set<String> set = new HashSet<>();
        for(int i =0 ;i < s.length() ; i++){
         
            Set<Character> set2 = new HashSet<>();
            while( i < s.length()){
                if(set2.contains(s.charAt(i))){
                    System.out.println(set2);
                    count++;
                    i--;
                    break;
                }
                set2.add(s.charAt(i));
                i++;
            }

        }
        
        return count+1;
    }

}