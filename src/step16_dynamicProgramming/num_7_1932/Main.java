package step16_dynamicProgramming.num_7_1932;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[testCase];

        int t=0;
        StringTokenizer st;
        while(t<testCase) {
            st = new StringTokenizer(br.readLine(), " ");
            int[] tempArr = new int[st.countTokens()];
            for (int i = 0; i < tempArr.length; i++) {
                tempArr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < tempArr.length; i++) {
                if (i == 0) {
                    tempArr[0] += arr[0];
                } else if (i == tempArr.length - 1) {
                    tempArr[i] += arr[i - 1];
                } else {
                    tempArr[i] += Math.max(arr[i - 1], arr[i]);
                }
            }
            for (int i = 0; i < tempArr.length; i++) {
                arr[i] = tempArr[i];
            }
            t++;
        }
        int MAX = Integer.MIN_VALUE;
        for(int i=0; i<testCase; i++){
            MAX = Math.max(MAX, arr[i]);
        }
        bw.write(Integer.toString(MAX));
        bw.flush();
        bw.close();
    }
}