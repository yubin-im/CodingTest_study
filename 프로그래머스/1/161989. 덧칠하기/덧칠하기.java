class Solution {
    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int index = 0;

        for(int s: section) {
            if(s > index) {
                answer++;
                // 칠해진 마지막 칸 인덱스
                index = s + m - 1;
            }
        }
        return answer;
    }
}