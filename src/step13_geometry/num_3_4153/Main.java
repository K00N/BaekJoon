package step13_geometry.num_3_4153;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] intArr = new int[3];
        double a, b, c;
        while(true) {
            for (int i = 0; i < 3; i++) {
                intArr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(intArr);
            if (intArr[2] == 0) { break; }
            a = Math.pow(intArr[0], 2);
            b = Math.pow(intArr[1], 2);
            c = Math.pow(intArr[2], 2);
            if( (a + b) == c ){
                bw.write("right");
                bw.newLine();
            } else{
                bw.write("wrong");
                bw.newLine();
            }
            st = new StringTokenizer(br.readLine(), " ");
        }
        bw.flush();
        bw.close();
    }
}
