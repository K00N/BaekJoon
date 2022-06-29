package step7_basicMath1.num_3_1193;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int addNum=0;
        int value=0;
        int numerator;
        int denominator;
        while(num > value){
            addNum++;
            value += addNum;
        }
        if(addNum%2 == 0){
            numerator = addNum - value + num;
            denominator = 1 + value - num;
        } else {
            numerator = 1 + value - num;
            denominator = addNum - value + num;
        }

        bw.write(Integer.toString(numerator));
        bw.write("/");
        bw.write(Integer.toString(denominator));
        bw.flush();
        bw.close();
    }
}