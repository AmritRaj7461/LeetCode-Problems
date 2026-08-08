class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++) {
            char letter = columnTitle.charAt(i);
            ans = letter - 'A' + 1;
            result = result * 26 + ans;
        }
        
        return result;
    }
}