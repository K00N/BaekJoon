package step14_numTheory.num_7_11050;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int binomial=1;
        for(int i=b+1; i<=a; i++){
            binomial = binomial*i;
        }
        for(int j=1; j<=a-b;j++){
            binomial = binomial/j;
        }
        bw.write(Integer.toString(binomial));
        bw.flush();
        bw.close();
    }
}
