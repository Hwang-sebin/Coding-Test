import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int len = S.length();

        System.out.print(len);
        sc.close();
    }
}
