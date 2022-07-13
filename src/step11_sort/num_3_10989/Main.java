package step11_sort.num_3_10989;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[] numArr = new int[10002];
        Arrays.fill(numArr, 0);

        int k;
        for(int i=0; i<testCase; i++){
            k=Integer.parseInt(br.readLine());
            numArr[k]++;
        }


        for(int j=0; j< numArr.length; j++){
            while(numArr[j]>0){
                bw.write(Integer.toString(j));
                bw.newLine();
                numArr[j]--;
            }
        }

        bw.flush();
        bw.close();
    }
}
