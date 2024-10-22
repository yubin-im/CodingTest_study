class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a) {
            answer += (n / a) * b;
            n = ((n / a) * b) + (n % a);  // 나머지는 다시 더해준다
        }

        return answer;
    }
}