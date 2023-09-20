import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stagePlayer = new int[N+1];
        int[] totalPlayer = new int[N];
        double[] fail = new double[N];

        // 사용자가 현재 도전 중인 스테이지 번호 배열 (stagePlayer)
        for(int i: stages) {
            for(int j = 0; j <= N; j++) {
                if(i == j+1) {
                    stagePlayer[j] = stagePlayer[j] + 1;
                }
            }
        }

        // 각 스테이지별 도달한 인원 수 배열 (totalPlayer)
        for(int i = 0; i < N; i++) {
            for(int j = i; j <= N; j++) {
                totalPlayer[i] += stagePlayer[j];
            }
        }

        // 실패율 (fail)
        for(int i = 0; i < N; i++) {
            if(totalPlayer[i] == 0) {
                fail[i] = 0;
            } else {
                fail[i] = (double) stagePlayer[i] / totalPlayer[i];
            }
        }

        // 이 밑에서부터는 지피티 도움...
        // 실패율을 내림차순으로 정렬하고 해당 인덱스를 answer 배열에 넣기
        Integer[] indexArray = new Integer[N];
        for (int i = 0; i < N; i++) {
            indexArray[i] = i;
        }

        Arrays.sort(indexArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (fail[o1] == fail[o2]) {
                    return o1 - o2;
                }
                return Double.compare(fail[o2], fail[o1]);
            }
        });

        for (int i = 0; i < N; i++) {
            answer[i] = indexArray[i] + 1;
        }

        return answer;
    }
}