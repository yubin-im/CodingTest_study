class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                answer += 1;
            }   
        }
        
        return answer;
    }
    
    // 소수 여부 확인 
    public boolean isPrime(int n) {
        if (n < 2) return false;  // 2 미만은 소수아님
        
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}