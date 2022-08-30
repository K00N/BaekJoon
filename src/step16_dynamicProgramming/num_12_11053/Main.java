package step16_dynamicProgramming.num_12_11053;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[testCase];
        int[] lengthArr = new int[testCase];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<testCase; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int maxLength=1;
        for(int i=0; i<testCase; i++){
            lengthArr[i]=1;
            for(int j=0; j<i; j++){
                if( arr[j]<arr[i] && lengthArr[i]<lengthArr[j]+1 ){
                    lengthArr[i] = lengthArr[j]+1;
                    maxLength = Math.max(maxLength, lengthArr[i]);
                }
            }
        }
        bw.write(Integer.toString(maxLength));
        bw.flush();
        bw.close();
    }
}