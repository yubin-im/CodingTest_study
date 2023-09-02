class Solution {
    public static boolean solution(int x) {
        int sum = 0;
        int num = x;  // while 문에서 x값 변하기 때문에 재선언

        // 자릿수의 합
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        // 하샤드 수 검사
        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}