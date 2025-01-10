import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int price = 0;

        for(int i=1; i<=N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            price+= (a*b);
        }
        if (X==price){
            System.out.print("Yes");
        } else{
            System.out.print("No");
        }
    }
}