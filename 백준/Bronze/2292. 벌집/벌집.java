import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int count = 1;
        if(n>1){
            n = n-1;
            while(n>0){
                n=n-(6*count);
                count++;
            }
            System.out.println(count);
        }else
            System.out.println(1);
    }
}
