import java.util.ArrayList;

class Solution {
    public static int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i % supo1.length]) {
                scores[0]++;
            }
            if (answers[i] == supo2[i % supo2.length]) {
                scores[1]++;
            }
            if (answers[i] == supo3[i % supo3.length]) {
                scores[2]++;
            }
        }

        int maxScore = Math.max(Math.max(scores[0], scores[1]), scores[2]);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (maxScore == scores[i]) {
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}