class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int date = 0;
        int[] monthDate = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  // 각 월의 일수
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};  // 16.01.01은 FRI부터 시작

        // 일수 더하기 
        for(int i = 0; i < a-1; i++) {
            date += monthDate[i];
        }
        date += b - 1;
        
        answer = days[date % 7];

        return answer;
    }
}