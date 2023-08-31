class Solution {
    public static int[] solution(long n) {
        int[] arrN = new int[String.valueOf(n).length()];
        int count = 0;

        while(n > 0) {
            arrN[count] = (int)(n % 10);
            n /= 10;
            count++;
        }

        return arrN;
    }
}