import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int n = sc.nextInt(); // 노드의 개수
        int m = sc.nextInt(); // 간선의 개수
        int v = sc.nextInt(); // 탐색 시작 노드

        // 인접 행렬 초기화
        int[][] a = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            a[v1][v2] = 1;
            a[v2][v1] = 1; // 무방향 그래프이므로 양방향 연결
        }

        // 방문 여부 배열 초기화
        boolean[] visited = new boolean[n + 1];

        // DFS (스택 기반)
        dfsStack(v, a, visited);
        System.out.println();

        // 방문 여부 배열 초기화
        Arrays.fill(visited, false);

        // BFS (큐 기반)
        bfs(v, a, visited);
    }

    // DFS 구현 (스택 기반)
    public static void dfsStack(int start, int[][] a, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;
        System.out.print(start + " ");

        while (!stack.isEmpty()) {
            int current = stack.peek();
            boolean hasUnvisitedNeighbor = false;

            for (int i = 1; i < a.length; i++) {
                if (a[current][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                    hasUnvisitedNeighbor = true;
                    break; // 한 번에 하나의 노드만 방문
                }
            }

            if (!hasUnvisitedNeighbor) {
                stack.pop(); // 더 이상 방문할 인접 노드가 없으면 스택에서 제거
            }
        }
    }

    // BFS 구현 (큐 기반)
    public static void bfs(int start, int[][] a, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int i = 1; i < a.length; i++) {
                if (a[current][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
