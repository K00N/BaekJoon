package step6_string.num_7_2908;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String words = br.readLine();
        String[] strArr = words.split(" ");

        String num1 = "";

        for (int i = 0; i < 3; i++) {
            num1 += Character.toString(strArr[0].charAt(2-i));
        }
        String num2 = "";
        for (int i = 0; i < 3; i++) {
            num2 += Character.toString(strArr[1].charAt(2-i));
        }

        if(Integer.parseInt(num1)>Integer.parseInt(num2)){
            bw.write(num1);
        } else {
            bw.write(num2);
        }


        bw.flush();
        bw.close();
    }
}