import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 우선순위 큐 생성 (최소 힙)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 모든 카드 묶음을 우선순위 큐에 넣기
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        int answer = 0;

        // 카드 묶음이 하나만 남을 때까지 반복
        while (pq.size() > 1) {
            // 가장 작은 두 묶음 꺼내기
            int first = pq.poll();
            int second = pq.poll();

            // 두 묶음 합치기
            int sum = first + second;
            // 비교 횟수 누적
            answer += sum;
            // 합친 묶음을 다시 큐에 넣기
            pq.add(sum);
        }

        System.out.println(answer);
    }
}