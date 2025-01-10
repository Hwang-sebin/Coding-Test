import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int minute = sc.nextInt();

        int time = H*60 + M + minute;
        H = time/60;
        M = time%60;

        if(H>=24) {
            H-=24;
        }

        System.out.print(H+ " "+ M);
    }
}