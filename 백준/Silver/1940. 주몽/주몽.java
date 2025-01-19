import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;

        int[] array = new int[N];
        int start = 0; 
        int end =array.length-1; 
        int sum =0;
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt(); 
        }

        Arrays.sort(array); 
        while(start < end){ 
            sum = array[start] + array[end];
            if(sum < M){ 
                start++;
            }else if(sum==M){ 
                start++;
                end--;
                count++;
            }else{ 
                end--;
            }
        }
        System.out.println(count);
    }
}