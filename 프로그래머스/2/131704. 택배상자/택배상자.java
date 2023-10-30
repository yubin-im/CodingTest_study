import java.util.Stack;

class Solution {
    public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> cb = new Stack<>();  // 예비 컨테이너 벨트
        int box = 1;  // 택배 상자
        int idx = 0;  // 인덱스

        // for 문의 i를 order의 index로 하고 택배상자는 변수로 하려했는데 실패..
//        for (int i = 0; i < order.length; i++) {
//            if(order[i] != box) {
//                cb.push(box);
//                box++;
//            } else {
//                answer++;
//                box++;
//            }
//            while(!cb.isEmpty() && cb.peek() == order[i]) {
//                cb.pop();
//                box++;
//                answer++;
//            }
//        }

        // for 문의 i를 택배상자로 하고 index를 별도 변수 선언!
        for (int i = 1; i <= order.length; i++) {
            if (order[idx] != i) {
                cb.push(i);
            } else {
                idx++;
                answer++;
            }
            while(!cb.isEmpty() && cb.peek() == order[idx]) {
                cb.pop();
                idx++;
                answer++;
            }
        }

        return answer;
    }
}