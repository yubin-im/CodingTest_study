class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                for(int x = 0; x < name.length; x++) {
                    if(photo[i][j].equals(name[x])) {
                        answer[i] += yearning[x];
                    }
                }
            }
        }
        
        
        return answer;
    }
}