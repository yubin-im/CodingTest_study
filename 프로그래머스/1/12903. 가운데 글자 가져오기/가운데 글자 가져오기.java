class Solution {
    public static String solution(String s) {
        String answer = "";
        int mid = s.length() / 2;

        if (s.length() % 2 == 0) {
            answer = s.substring(mid-1, mid+1);
        } else {
            answer = s.substring(mid, mid+1);
        }

        return answer;
    }
}