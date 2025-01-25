import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[26];

        String name = sc.next(); // backjoon 이름 입력받음

        for(int j=0; j<array.length;j++){
            array[j] = -1; // 배열의 -1을 채운다.
        }

        for(int i=0; i<name.length();i++){
            char result = name.charAt(i); // 0번 일 경우 b를 가져온다 . b = 98

            if(array[result-'a']== -1){ // array[result-'a'] = array[1] == -1이냐 묻는 것.
                array[result-'a'] = i; //array[1] = 0을 넣는다.
                //result = a 일 경우 a = 97이된다.
                // 97 - 97 = 0 임으로 array[0] = 1을 넣게 되면 1 0 -1 -1 ...로 쭉 이어진다.
            }
        }

        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
}
