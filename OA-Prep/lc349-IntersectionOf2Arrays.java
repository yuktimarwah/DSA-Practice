class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> ansList = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {

            set.add(nums1[i]);

        }

        for (int i = 0; i < nums2.length; i++) {

            if (set.contains(nums2[i])) {

                ansList.add(nums2[i]);

                set.remove(nums2[i]);

            }
        }

        int size = ansList.size();

        int[] ans = new int[size];

        for (int i = 0; i < size; i++) {

            ans[i] = ansList.get(i);
        }

        return ans;
    }
}
