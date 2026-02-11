import java.util.*;
import java.io.*;

public class Main {

    static class Container {
        int weight; // 무게
        int priority; // 우선순위

        Container(int weight, int priority) { //생성자
            this.weight = weight;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 컨테이너 개수
        int M = Integer.parseInt(st.nextToken()); // 우선순위 종류

        Queue<Container> mainBelt = new LinkedList<>(); //레일은 선입선출
        Stack<Container> loadSpace = new Stack<>(); // 적재공간은 후입선출
        int[] count = new int[M + 1];

        for (int i = 0; i < N; i++) { //N개의 컨테이너 입력받아 레일에 추가
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st2.nextToken()); //우선순위
            int w = Integer.parseInt(st2.nextToken()); //무게
            mainBelt.add(new Container(w, p)); //레일에 추가
            count[p]++; //해당 우선순위 개수 증가
        }

        long time = 0; //비용
        int currentPriority = M; //가장 낮은 우선순위

        while (currentPriority >= 1) {
            Container c = mainBelt.poll(); //레일 맨 앞에서 컨테이너 꺼내기

            if (c.priority == currentPriority) { // [경우 1] 현재 처리할 우선순위와 같은 경우

                Stack<Container> temp = new Stack<>(); // 무게 재배치를 위한 임시 보관 Stack

                while (!loadSpace.isEmpty() // 적재공간 top이 같은 우선순위이면서 새 컨테이너보다 가벼우면 꺼내서 temp에 보관
                        && loadSpace.peek().priority == currentPriority //같은 우선순위
                        && loadSpace.peek().weight < c.weight) { //top이 더 가벼우면
                    Container top = loadSpace.pop(); //적재공간에서 꺼내기
                    temp.push(top); //임시보관
                    time += top.weight; //비용
                }

                loadSpace.push(c); //새 컨테이너 적재
                time += c.weight; // 적재 비용

                while (!temp.isEmpty()) { // temp에 보관했던 컨테이너 다시 적재
                    Container top = temp.pop(); // temp에서 꺼내기
                    loadSpace.push(top); // 적재
                    time += top.weight; // 비용
                }

                count[currentPriority]--; //현재 우선순위 개수 감소

                if (count[currentPriority] == 0) { //현재 우선순위 컨테이너 없으면 다음 우선순위 로
                    currentPriority--;
                }

            } else {
                if (c.priority < currentPriority) { //아직 차례 아님 레일 뒤로
                    // 높은 우선순위 → 레일 뒤로
                    mainBelt.add(c);
                    time += c.weight;
                }
            }
        }

        System.out.println(time); // 비용 출력
    }
}