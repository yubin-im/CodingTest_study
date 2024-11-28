import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int count = 0;
            
            for(int j = 1; j*j <= i; j++) {
                if(j*j == i) count++;  // 제곱근일 때 중복안되도록 1 증가
                else if(i % j == 0) count += 2;  // 약수 j와 i/j로 2 증가
            }
            
            if(count > limit) count = power;  // count가 limit 초과시 고정 power로 변경 
            answer += count;
        }
        
        return answer;
    }
}