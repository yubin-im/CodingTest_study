import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
     public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                arrList.add(arr[i]);
            }
        }

        if(arrList.size() == 0) {
            arrList.add(-1);
        } else {
            Collections.sort(arrList);
        }

        Integer[] ansArr = arrList.toArray(new Integer[arrList.size()]);
        int[] answer = Arrays.stream(ansArr).mapToInt(Integer::intValue).toArray();

        return answer;
    }
}