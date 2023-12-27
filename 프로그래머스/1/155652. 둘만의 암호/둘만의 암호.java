class Solution {
    public static String solution(String s, String skip, int index) {
        String answer = "";

        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);  // i번째 문자열 char 타입으로 변환
            int count = 0;

            while(count < index) {
                ++a;
                if(a > 'z') {
                    a -= 26;
                }
                if(skip.contains(a + "")) {  // skip에 해당 문자열 포함되어있는지 확인
                    continue;
                } else {
                    count++;
                }
            }
            answer += a;
        }
        return answer;
    }
}