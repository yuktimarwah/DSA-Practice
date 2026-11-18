class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {

                map.put(nums[i], 1);

            }
            else {

                map.put(nums[i], map.get(nums[i]) + 1);

            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            maxHeap.add(entry);

        }

        ArrayList<Integer> ansList = new ArrayList<>();

        for (int i = 0; i < k; i++) {

            ansList.add(maxHeap.poll().getKey());

        }

        int size = ansList.size();

        int[] ans = new int[size];

        for (int i = 0; i < size; i++) {

            ans[i] = ansList.get(i);

        }

        return ans;
    }
}
