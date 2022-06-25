package step6_string.num_4_2675;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int TestCase = Integer.parseInt(sc.nextLine());

        for(int tc=0;tc<TestCase;tc++) {
            String R_and_S = sc.nextLine();
            String[] RS_Arr = R_and_S.split(" ");
            int repeat = Integer.parseInt(RS_Arr[0]);
            String words = RS_Arr[1];

            for (int i = 0; i < words.length(); i++) {
                for (int j = 0; j < repeat; j++) {
                    System.out.print(words.charAt(i));
                }
            }
            System.out.print("\n");
        }
    }
}
