class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int num = columnNumber;
        while(num > 0) {
            num--;
            char letter = (char) ('A' + (num % 26));
            sb.insert(0, letter);
            num /= 26;
        }
        return sb.toString();
        
    }
}