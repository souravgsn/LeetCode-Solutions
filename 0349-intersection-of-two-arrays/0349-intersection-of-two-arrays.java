class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
 
        for(int i=0 ; i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        set1.retainAll(set2);
        return toIntArray(set1);
    }

    public static int[] toIntArray(HashSet<Integer> list) {
        int[] ret = new int[list.size()];
        Iterator<Integer> it = list.iterator();  
        int i=0;
        while (it.hasNext()) {  
            ret[i++] = it.next();
        }  
        return ret;
    }
}