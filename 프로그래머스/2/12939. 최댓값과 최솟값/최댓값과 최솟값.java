import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        int min = Collections.min(list);
        int max = Collections.max(list);

        String answer = min + " " + max;
        
        return answer;
    }
}