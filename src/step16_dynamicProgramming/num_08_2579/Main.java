package step16_dynamicProgramming.num_08_2579;

import java.io.*;

public class Main {
    public static int[] stairSum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[testCase];
        stairSum = new int[testCase];
        for(int i=0; i<testCase; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        if(testCase<3){
            int m=0;
            for(int i=0; i<testCase;i++){
                m += arr[i];
            }
            bw.write(Integer.toString(m));
            bw.flush();
            bw.close();
            System.exit(0);
        }
        stairSum[0] = arr[0];
        stairSum[1] = arr[1]+arr[0];
        stairSum[2] = Math.max(arr[0]+arr[2], arr[1]+arr[2]);

        for(int i=3; i<testCase; i++){
            stairSum[i] = Math.max(stairSum[i-2]+arr[i], stairSum[i-3]+arr[i-1]+arr[i]);
        }
        bw.write(Integer.toString(stairSum[testCase-1]));
        bw.flush();
        bw.close();
    }
}
