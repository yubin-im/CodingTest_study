class Solution {
    public static String solution(String phone_number) {
        char[] numArr = phone_number.toCharArray();

        for(int i = 0; i < numArr.length-4; i++) {
            numArr[i] = '*';
        }

        String answer = new String(numArr);
        return answer;
    }
}