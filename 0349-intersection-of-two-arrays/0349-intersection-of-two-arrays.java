class Solution {
     public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            int n = nums2[i];
            if(set1.contains(n)){
                if(!ans.contains(n)){
                    ans.add(n);
                }
            }
        }
        
        return toIntArray(ans);
    }
    public static int[] toIntArray(List<Integer> list) {
        int[] ret = new int[list.size()];
        for(int i = 0; i < ret.length; i++)
          ret[i] = list.get(i);
        return ret;
    }
}