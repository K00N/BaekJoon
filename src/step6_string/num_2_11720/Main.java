package step6_string.num_2_11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        int answer = 0;
        String ts = sc.next();
        for (int i = 0; i < repeat; i++) {
            answer += Character.getNumericValue(ts.charAt(i));
        }
        System.out.println(answer);
    }
}
