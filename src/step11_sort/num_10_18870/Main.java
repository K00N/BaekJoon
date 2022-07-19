package step11_sort.num_10_18870;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        String[] strArr ;

        strArr = br.readLine().split(" ");
        int[] intArr = new int[testCase];
        for(int i=0;i<testCase;i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        int[] sortedIntArr = new int[testCase];
        System.arraycopy(intArr, 0, sortedIntArr, 0, testCase);

        Arrays.sort(sortedIntArr);

        for(int l=0;l<testCase;l++){
            System.out.print(sortedIntArr[l]);
        }

        for(int j=0;j< testCase;j++){
            for(int k=0;k<testCase;k++){
                if(intArr[j]==sortedIntArr[k]){
                    bw.write(Integer.toString(k)+" ");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
