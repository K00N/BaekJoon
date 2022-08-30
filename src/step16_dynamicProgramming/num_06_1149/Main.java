package step16_dynamicProgramming.num_06_1149;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int t=0;
        StringTokenizer st;
        int before_r = 0, before_g = 0, before_b = 0;
        int r, g, b;
        while(t<testCase) {
            st = new StringTokenizer(br.readLine(), " ");
            r = Integer.parseInt(st.nextToken()) + Math.min(before_g, before_b);
            g = Integer.parseInt(st.nextToken()) + Math.min(before_r, before_b);
            b = Integer.parseInt(st.nextToken()) + Math.min(before_r, before_g);
            before_r = r;
            before_g = g;
            before_b = b;
            t++;
        }
        int MIN = Math.min(before_r, before_g);
        MIN = Math.min(MIN, before_b);
        bw.write(Integer.toString(MIN));
        bw.flush();
        bw.close();
    }
}
