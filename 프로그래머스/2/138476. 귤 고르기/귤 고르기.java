import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // map에 귤 크기별 개수 담기
        // getOrDefault(): 찾는 키 존재시 찾는 키의 값을 반환하고 없다면 기본값(0) 반환
        for (int i: tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // 귤의 크기별 리스트 생성, 크기개수 기준으로 내림차순 정렬
        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((o1, o2) -> map.get(o2) - map.get(o1));

        // k개수만큼 담기
        for (Integer i: keyList) {
            if (k <= 0) {
                break;
            }
            answer++;
            k -= map.get(i);
        }

        return answer;
    }
}