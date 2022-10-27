import java.util.HashMap;

class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i - map.get(s.charAt(i)));

            }else{
                map.put(s.charAt(i),i);
            }
        }
        
        for (Character x : map.keySet()){
            int j = (int)x;
            j = j -97;
            if(distance[j] != map.get(x)-1 ){
                return false;
            }
            
        } 
        
      

        return true;

    }
}