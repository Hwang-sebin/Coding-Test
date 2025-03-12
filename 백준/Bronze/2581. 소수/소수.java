import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = N;
        int count = 0;
        for(int i=M; i<=N; i++){
            int div = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    div++;
                }
            }
            if (div == 2){
                sum+=i;
                count++;
                if(min>i){
                    min = i;
                }
            }
        }
        if(count==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
