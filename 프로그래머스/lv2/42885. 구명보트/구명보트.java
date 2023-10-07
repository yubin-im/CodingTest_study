import java.util.Arrays;

class Solution {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        int minIdx = 0;

        Arrays.sort(people);

        for (int i = people.length - 1; i >= minIdx; i--) {
            if (people[minIdx] + people[i] <= limit) {
                answer++;
                minIdx++;
            } else {
                answer++;
            }
        }

        return answer;
    }
}