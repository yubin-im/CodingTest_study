import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr) {
        int min = arr[0];
        int idx = 0;

        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        } else {
            // 제일 작은 수 구하기
            for(int i = 1; i < arr.length; i++){
                min = Math.min(min, arr[i]);
            }

            // 배열 생성
            int[] answer = new int[arr.length-1];

            // 제일 작은 수 제외한 값 넣기
            for(int i = 0; i < arr.length; i++){
                if(min == arr[i]){
                    continue;
                }
                answer[idx++] = arr[i];
            }
            return answer;
        }
    }
}