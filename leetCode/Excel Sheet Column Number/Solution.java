class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        
        for (int i = 0; i < columnTitle.length(); i++) {
            sum*= 26;
            char c = columnTitle.charAt(i);
            int n = (int) (c - 'A' + 1);
            sum+= n;
        }
        return sum;
    }
}
