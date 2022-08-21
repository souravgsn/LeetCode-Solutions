class Solution {
    public String sortSentence(String s) {
       String[] na = s.split(" ");
        String[] ans = new String[na.length];
        StringBuilder sb = new StringBuilder();
        int i =0;
        for (String each : na) {
              i = (int)(each.charAt(each.length()-1)-'0');
              ans[i-1] = each.substring(0, each.length()-1);
        }

        for (i = 0; i < ans.length-1; i++) 
          sb.append(ans[i]).append(" ");
        
        sb.append(ans[i]);
	return sb.toString();
        
    }
}