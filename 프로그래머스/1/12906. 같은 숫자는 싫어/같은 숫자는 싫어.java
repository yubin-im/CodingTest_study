import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                continue;
            } else {
                list.add(arr[i-1]);
            }
        }
        list.add(arr[arr.length-1]);  // 마지막 원소는 수기로 넣어줌 
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}