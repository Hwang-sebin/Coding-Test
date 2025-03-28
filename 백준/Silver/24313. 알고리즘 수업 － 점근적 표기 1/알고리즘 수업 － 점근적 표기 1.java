import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1= sc.nextInt();
        int a0= sc.nextInt();
        int c= sc.nextInt();
        int n0= sc.nextInt();

        boolean check = false;
        if (a1 < c) {
            check = (a1 * n0 + a0 <= c * n0);
        } else if (a1 == c) {
            check = (a0 <= 0);
        }

        System.out.print(check ? 1 : 0);

    }
}
