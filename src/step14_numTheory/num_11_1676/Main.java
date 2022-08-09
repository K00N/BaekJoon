package step14_numTheory.num_11_1676;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int five = 0;
        while (a > 4){
            five += a/5;
            a = a/5;
        }
        bw.write(Integer.toString(five));
        bw.flush();
        bw.close();
    }
}
