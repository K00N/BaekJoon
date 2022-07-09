package step9_recursive.num_1_10872;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int factoNum = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(factorial(factoNum)));
        bw.flush();
        bw.close();
    }

    public static int factorial(int factoNum){

        if(factoNum <= 1) { return 1;}

        else { return factorial(factoNum-1)*factoNum;}
    }
}
