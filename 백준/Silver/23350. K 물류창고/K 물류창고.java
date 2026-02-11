import java.util.*;
import java.io.*;

public class Main {

    static class Container {
        int weight;
        int priority;

        Container(int weight, int priority) {
            this.weight = weight;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Queue<Container> mainBelt = new LinkedList<>();
        Stack<Container> loadSpace = new Stack<>();
        int[] count = new int[M + 1];

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st2.nextToken());
            int w = Integer.parseInt(st2.nextToken());
            mainBelt.add(new Container(w, p));
            count[p]++;
        }

        long time = 0;
        int currentPriority = M;

        while (currentPriority >= 1) {
            Container c = mainBelt.poll();

            if (c.priority == currentPriority) {

                Stack<Container> temp = new Stack<>();

                while (!loadSpace.isEmpty()
                        && loadSpace.peek().priority == currentPriority
                        && loadSpace.peek().weight < c.weight) {
                    Container top = loadSpace.pop();
                    temp.push(top);
                    time += top.weight;
                }

                loadSpace.push(c);
                time += c.weight;

                while (!temp.isEmpty()) {
                    Container top = temp.pop();
                    loadSpace.push(top);
                    time += top.weight;
                }

                count[currentPriority]--;

                if (count[currentPriority] == 0) {
                    currentPriority--;
                }

            } else {
                if (c.priority < currentPriority) {
                    // 높은 우선순위 → 레일 뒤로
                    mainBelt.add(c);
                    time += c.weight;
                }
            }
        }

        System.out.println(time);
    }
}