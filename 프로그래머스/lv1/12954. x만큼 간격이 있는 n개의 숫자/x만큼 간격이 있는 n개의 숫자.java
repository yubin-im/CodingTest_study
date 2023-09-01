class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 1; i <= n; i++) {
            answer[i-1] = (long) i * x;
        }

        return answer;
    }
}