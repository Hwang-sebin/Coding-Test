import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] str = new char[5][15];
        
        for (int i = 0; i < str.length; i++) {
            String input = sc.next();
            // 15개 문자 넣기
            for (int j = 0; j < input.length(); j++) {
                str[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) { 
            for (int j = 0; j < 5; j++) { 
                if (str[j][i] == '\0') //빈문자열이면 출력하지 않기
                    continue;
                System.out.print(str[j][i]);

            }
        }
    }
}
