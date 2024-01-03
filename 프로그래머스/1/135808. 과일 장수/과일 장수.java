import java.util.Arrays;

class Solution {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);  // 오름차순 정렬

        // 사과 점수 낮은 것들을 버리려면 뒤에서부터 for 문 
        for(int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }

        return answer;
    }
}