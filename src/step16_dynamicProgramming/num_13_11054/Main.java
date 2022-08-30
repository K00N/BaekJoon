package step16_dynamicProgramming.num_13_11054;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[testCase];
        int[] leftLengthArr = new int[testCase];
        int[] rightLengthArr = new int[testCase];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<testCase; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<testCase; i++){
            leftLengthArr[i]=1;
            for(int j=0; j<i; j++){
                if( arr[j]<arr[i] && leftLengthArr[i]<leftLengthArr[j]+1 ){
                    leftLengthArr[i] = leftLengthArr[j]+1;
                }
            }
        }
        for(int i=testCase-1; i>=0; i--){
            rightLengthArr[i] = 1;
            for(int j=testCase-1; j>i; j--){
                if( arr[j]<arr[i] && rightLengthArr[i]<rightLengthArr[j]+1 ){
                    rightLengthArr[i] = rightLengthArr[j]+1;
                }
            }
        }
        int maxLength=0;
        for(int i=0; i<testCase; i++){
            maxLength = Math.max(maxLength, leftLengthArr[i]+rightLengthArr[i]);
        }
        bw.write(Integer.toString(maxLength-1));
        bw.flush();
        bw.close();
    }
}