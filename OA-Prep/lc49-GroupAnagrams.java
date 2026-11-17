class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();

        HashMap<HashMap<Character, Integer>, List<String>> fullMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String word = strs[i];

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = 0; j < word.length(); j++) {

                if (!map.containsKey(word.charAt(j))) {

                    map.put(word.charAt(j), 1);

                }
                else {

                    map.put(word.charAt(j), map.get(word.charAt(j)) + 1);

                }
            }

            if (!fullMap.containsKey(map)) {

                ArrayList<String> list = new ArrayList<>();
                list.add(word);
                
                fullMap.put(map, list);

            }
            else {


                List<String> list = fullMap.get(map);
                list.add(word);

                fullMap.put(map, list);
            }

        }

        for (List<String> li : fullMap.values()) {

            ans.add(li);
        }

        return ans;
    }
}
