class Solution {
    public static int[] solution(String[] wallpaper) {
        // {위, 왼쪽, 오른쪽, 아래}
        int[] answer = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        // 위, 왼쪽은 min, 오른쪽, 아래는 max 구해야함
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[0] = Math.min(i, answer[0]);
                    answer[1] = Math.min(j, answer[1]);
                    answer[2] = Math.max(i + 1, answer[2]);
                    answer[3] = Math.max(j + 1, answer[3]);
                }
            }
        }

        return answer;
    }
}