class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
        
        while (left <= right) {
            // If the lightest and heaviest person can share a boat
            if (people[left] + people[right] <= limit) {
                boats++;
                left++;// Lightest person gets on board
                right--; 
            }
            
            // The heaviest person ALWAYS gets a boat (alone or paired)
         else{ 
            right--;
            boats++;
         }
        }
        
        return boats;
    }
}
