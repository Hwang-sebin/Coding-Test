import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();

        sc.close();

        char[] re_num1 = new char[3];
        char[] re_num2 = new char[3];
        int n = 0;

        for(int i=2;i>=0;i--) {
            re_num1[i] = num1.charAt(n);
            re_num2[i] = num2.charAt(n);
            n++;
        }
        String str_num1 = new String(re_num1);
        String str_num2 = new String(re_num2);
        int a = Integer.parseInt(str_num1);
        int b = Integer.parseInt(str_num2);

        System.out.println(a>b?a:b);
    }
}
