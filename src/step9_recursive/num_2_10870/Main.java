package step9_recursive.num_2_10870;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int fiboNum = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(fibonacci(fiboNum)));
        bw.flush();
        bw.close();
    }

    public static int fibonacci(int fiboNum){

        if(fiboNum <= 1) { return fiboNum;}
        else { return fibonacci(fiboNum-1)+fibonacci(fiboNum-2);}
    }
}