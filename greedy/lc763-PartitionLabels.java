class Solution {
    public List<Integer> partitionLabels(String s) {
        
        List<Integer> ans = new ArrayList<>();

        int[] lastOccurences = new int[26];

        for(int i = 0; i < s.length(); i++) {

            int idx = s.charAt(i) - 'a';
            lastOccurences[idx] = i;
        }

        int partitionStart = 0;
        int partitionEnd = 0;

        for (int i = 0; i < s.length(); i++) {

            int size = 0;

            int index = s.charAt(i) - 'a';

            partitionEnd = Math.max(partitionEnd, lastOccurences[index]);  
            
            if (i == partitionEnd) {
            size = partitionEnd - partitionStart + 1;
            ans.add(size);
            partitionStart = partitionEnd + 1;
            }

        }

        return ans;
    }
}
