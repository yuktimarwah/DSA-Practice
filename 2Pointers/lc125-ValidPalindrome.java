class Solution {
    public boolean isPalindrome(String s) {
    
        String lower = s.toLowerCase();

        int l = 0;
        int r = lower.length() - 1;

        while (r >= l) {

            while (l < r && ! Character.isLetterOrDigit(lower.charAt(r))) {
                r--;
            }
            while (l < r && ! Character.isLetterOrDigit(lower.charAt(l))) {
                l++;
            }
            if (lower.charAt(l) != lower.charAt(r)) {
                return false;
            }
            else {
                l++;
                r--;
            }
        }
        return true;
    }
}
