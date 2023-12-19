import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playersMap = new HashMap<String, Integer>();

        // playersMap 생성
        for(int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }

        for(String name : callings) {
            int index = playersMap.get(name);

            playersMap.put(players[index-1], index);
            playersMap.put(name, index-1);

            players[index] = players[index-1];
            players[index-1] = name;
        }

        return players;
    }
}