package step7_basicMath1.num_3_1193;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int fiboNum=0;
        int fibo=0;
        int numerator;
        int denominator;
        while(num > fibo){
            fiboNum++;
            fibo += fiboNum;
        }
        if(fiboNum%2 == 0){
            numerator = fiboNum - fibo + num;
            denominator = 1 + fibo - num;
        } else {
            numerator = 1 + fibo - num;
            denominator = fiboNum - fibo + num;
        }

        bw.write(Integer.toString(numerator));
        bw.write("/");
        bw.write(Integer.toString(denominator));
        bw.flush();
        bw.close();
    }
}