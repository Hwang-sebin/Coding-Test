import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int count = 0;

        for(int i = 0; i < N; i++) {

            boolean isPrime = true;

            int num = in.nextInt();

            if(num == 1) {
                continue;
            }
            for(int j = 2; j <= (num/2); j++) {
                if(num % j == 0) {
                    isPrime = false;	// 소수가 아니므로 false
                }
            }
            if(isPrime) {	// 소수인경우 count 값 1 증가
                count++;
            }
        }
        System.out.println(count);
    }

}
