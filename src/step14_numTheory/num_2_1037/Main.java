package step14_numTheory.num_2_1037;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] divisorArr = new int[testCase];

        for(int i=0; i<testCase; i++){
            divisorArr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(divisorArr);
        int answer=0;
        if( testCase == 1){
            answer = divisorArr[0]*divisorArr[0];
        } else {
            answer = divisorArr[0]*divisorArr[divisorArr.length-1];
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}
