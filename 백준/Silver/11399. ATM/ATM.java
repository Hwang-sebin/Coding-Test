import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] num = new int[N];
        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }

        // 정렬 - 삽입 정렬
        int i,j;
        for(i= 1; i< N; i++){
            int key = num[i];
            for(j = i-1; j>=0&&num[j]>key; j--){
                num[j+1] = num[j];
            }
            num[j+1] = key;
        }

        // 최솟값 구하기
        int minSum = 0;
        int sum = 0;
        for(i=0; i<N; i++){
            sum += num[i];
            minSum += sum;
        }

        // 결과 출력
        System.out.println(minSum);

    }
}
