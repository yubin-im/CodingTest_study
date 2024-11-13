import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        ArrayList<Integer> rank = new ArrayList<Integer>();
        
        for(int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            Collections.sort(rank);
            
            // 명예의 전당이 k개 이상일 때 부터 가장 낮은 점수 제거
            if(i >= k) {
                rank.remove(0);
            }
            
            // rank 중 가장 작은 수 담기 
            answer[i] = rank.get(0);
        }
        
        return answer;
    }
}