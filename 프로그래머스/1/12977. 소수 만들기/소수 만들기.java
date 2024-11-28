class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        int len = nums.length;
        
        for(int i = 0; i < len; i++) {
            for(int j = i+1; j < len; j++) {
                for(int k = j+1; k < len; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    
                    if(isPrime(sum)) {
                        answer++;
                    }
                }
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