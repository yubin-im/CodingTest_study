import java.util.Set;
import java.util.TreeSet;

class Solution {
    public static int solution(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        
        // 중복 제거
        for (int num: nums) {
            set.add(num);
        }
        
        int answer = Math.min(set.size(), nums.length/2);
        
        return answer;
    }
}