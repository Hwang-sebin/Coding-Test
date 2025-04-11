import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        boolean hasZero = false;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > 1) {
                positive.add(num);
            } else if (num < 0) {
                negative.add(num);
            } else if (num == 1) {
                result += 1;  // 1은 곱하지 않고 바로 더함
            } else {  // num == 0
                hasZero = true;
            }
        }

        // 양수는 내림차순, 음수는 오름차순으로 정렬
        Collections.sort(positive, Collections.reverseOrder());
        Collections.sort(negative);

        // 양수 처리
        for (int i = 0; i < positive.size() - 1; i += 2) {
            result += positive.get(i) * positive.get(i + 1);
        }
        if (positive.size() % 2 == 1) {
            result += positive.get(positive.size() - 1);
        }

        // 음수 처리
        for (int i = 0; i < negative.size() - 1; i += 2) {
            result += negative.get(i) * negative.get(i + 1);
        }
        if (negative.size() % 2 == 1 && !hasZero) {
            result += negative.get(negative.size() - 1);
        }

        System.out.println(result);
    }
}
