import java.util.*;

public class Main {
    private static ArrayList<Integer>[] list;
    private static int ans = 0;
    private static boolean[] v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 노드와 간선 수 입력
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 그래프 초기화
        list = new ArrayList[N];
        v = new boolean[N];
        for(int i=0; i<N; i++) {
            list[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for(int i=0; i<M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        sc.close(); // 스캐너 종료

        // 모든 노드에서 DFS 시도
        for(int i=0; i<N; i++) {
            if(ans == 0) dfs(i, 1);
        }

        System.out.println(ans); // 결과 출력
    }

    // DFS 메서드는 원본 유지
    public static void dfs(int start, int depth) {
        if (depth == 5) {
            ans = 1;
            return;
        }
        v[start] = true;
        for (int i = 0; i < list[start].size(); i++) {
            int next = list[start].get(i); // 인접 노드 가져오기
            if (!v[next]) {
                dfs(next, depth + 1);
            }
        }
        v[start] = false;
    }

}
