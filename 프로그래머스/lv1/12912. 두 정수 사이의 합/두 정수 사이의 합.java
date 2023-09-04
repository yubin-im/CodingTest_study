class Solution {
   public static long solution(int a, int b) {
        long answer = 0;

        if(a <= b) {
            for(long i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (long i = a; i >= b; i--) {
                answer += i;
            }
        }

        return answer;
    }
}