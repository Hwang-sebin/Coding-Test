import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int xmin = 10000;
        int xmax = -10000;
        int ymin = 10000;
        int ymax = -10000;
        int area = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            if (xmin > x[i]) {
                xmin = x[i];
            }
            if (ymin > y[i]) {
                ymin = y[i];
            }
            if (xmax < x[i]) {
                xmax = x[i];
            }
            if (ymax < y[i]) {
                ymax = y[i];
            }
        }
        area = (xmax - xmin) * (ymax - ymin);
        System.out.println(area);
    }
}