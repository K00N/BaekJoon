package step14_numTheory.num_5_3036;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int testCase = Integer.parseInt(br.readLine());
        int t=0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int radius = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int[] circleArr = new int[testCase-1];
        int circleRadius;
        int GCD;
        for(int i=0; i<testCase-1; i++){
            circleRadius = Integer.parseInt(st.nextToken());
            GCD = getGCD(radius, circleRadius);
            sb.append(radius/GCD).append("/").append(circleRadius/GCD).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int getGCD(int num1, int num2){
        while(num2 != 0) {
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        return num1;
    }
}
