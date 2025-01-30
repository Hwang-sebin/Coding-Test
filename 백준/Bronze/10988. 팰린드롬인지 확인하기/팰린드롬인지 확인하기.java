import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();

        StringBuilder reversed = new StringBuilder();

        for(int i = S.length()-1; i>=0;i--) {
            reversed.append(S.charAt(i));
        }

        if (S.equals(reversed.toString())) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
