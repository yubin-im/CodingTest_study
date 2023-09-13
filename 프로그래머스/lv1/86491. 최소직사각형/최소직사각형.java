class Solution {
    public static int solution(int[][] sizes) {
        int max_row = 0;
        int max_column = 0;

        for (int i = 0; i < sizes.length; i++) {
            int row = Math.max(sizes[i][0], sizes[i][1]);
            int column = Math.min(sizes[i][0], sizes[i][1]);

            max_row = Math.max(max_row, row);
            max_column = Math.max(max_column, column);
        }
        
        int answer = max_row * max_column;

        return answer;
    }
}