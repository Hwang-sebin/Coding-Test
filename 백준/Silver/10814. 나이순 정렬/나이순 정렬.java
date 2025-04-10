import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = in.next();  // 나이
            arr[i][1] = in.next();  // 이름
        }

        // 나이만 비교하여 정렬 (나이가 같으면 입력 순서 유지 - 안정 정렬)
        Arrays.sort(arr, (e1, e2) -> {
            return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
