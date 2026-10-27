class Solution {
    public int activitySelection(int[] start, int[] finish) {
        
        int n = start.length;
        
        Integer[] indices = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            
            indices[i] = i;
            
        }
        
        Arrays.sort(indices, (a,b) -> Integer.compare(finish[a], finish[b]));
        
        int selectedActivities = 1;
        
               
             
        int lastFinish = finish[indices[0]];
        
        for (int i = 1; i < n; i++) {
            
            if (start[indices[i]] > lastFinish) {
                
                selectedActivities++;
                lastFinish = finish[indices[i]];
                
            }
            
        }
        
        return selectedActivities;
    }
}

