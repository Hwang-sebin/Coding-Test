import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double gradeSum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String object = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            sum += score;

            switch (grade) {
                case "A+": gradeSum += score * 4.5; break;
                case "A0": gradeSum += score * 4.0; break;
                case "B+": gradeSum += score * 3.5; break;
                case "B0": gradeSum += score * 3.0; break;
                case "C+": gradeSum += score * 2.5; break;
                case "C0": gradeSum += score * 2.0; break;
                case "D+": gradeSum += score * 1.5; break;
                case "D0": gradeSum += score; break;
                case "F": gradeSum += score * 0.0; break;
                case "P": sum -= score; break;
            }
        }

        System.out.print(gradeSum / sum);
    }
}
