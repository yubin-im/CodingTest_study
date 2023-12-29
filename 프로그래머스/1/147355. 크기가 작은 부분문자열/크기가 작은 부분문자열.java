class Solution {
    public static int solution(String t, String p) {
        int answer = 0;

        // substring으로 문자열 자르기, Long.parseLong으로 String -> Long으로 변환
        for(int i = 0; i <= t.length() - p.length(); i++) {
            if(Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}