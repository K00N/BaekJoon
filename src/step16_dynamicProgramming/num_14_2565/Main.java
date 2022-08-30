package step16_dynamicProgramming.num_14_2565;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[501];
        int[] lengthArr = new int[501];
        int t=0;
        int idx, value;
        StringTokenizer st;
        while (t<testCase){
            st = new StringTokenizer(br.readLine(), " ");
            idx = Integer.parseInt(st.nextToken());
            value = Integer.parseInt(st.nextToken());
            arr[idx] = value;
            t++;
        }
        int maxLength=0;
        for(int i=0; i<501; i++){
            if(arr[i] != 0) {
                lengthArr[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (arr[j] < arr[i] && lengthArr[i] < lengthArr[j] + 1) {
                        lengthArr[i] = lengthArr[j] + 1;
                        maxLength = Math.max(maxLength, lengthArr[i]);
                    }
                }
            }
        }
        bw.write(Integer.toString(testCase-maxLength));
        bw.flush();
        bw.close();
    }
}