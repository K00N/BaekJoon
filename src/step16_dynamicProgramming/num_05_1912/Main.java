package step16_dynamicProgramming.num_05_1912;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int MAX = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n=0;

        for(int i=0; i<testCase; i++){
            if(n<0){ n=0; }
            n += Integer.parseInt(st.nextToken());
            MAX = Math.max(MAX, n);
        }

        bw.write(Integer.toString(MAX));
        bw.flush();
        bw.close();
    }
}
