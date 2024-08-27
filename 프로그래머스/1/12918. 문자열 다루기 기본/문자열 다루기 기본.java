class Solution {
    public boolean solution(String s) {
        int len = s.length();

        if(len == 4 || len == 6) {
            for(int i = 0; i < len; i++) {
                char ch = s.charAt(i);
                if(ch < '0' || ch > '9') {
                    return false;
                }
            } return true;
        } else {
            return false;
        }
    }
}