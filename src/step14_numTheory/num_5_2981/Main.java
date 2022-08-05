package step14_numTheory.num_5_2981;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int testCase = Integer.parseInt(br.readLine());
        int[] testArr = new int[testCase];
        for(int i=0; i<testCase; i++){
            testArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(testArr);

        int[] subArr = new int[testCase-1];
        for(int i=0; i<testArr.length-1; i++){
            subArr[i] = testArr[i+1]-testArr[i];
        }
        Arrays.sort(subArr);


        /* GCD구하기
        * */
        int GCD =subArr[0];
        for(int k=1; k< subArr.length; k++){
            GCD = getGCD(GCD, subArr[k]);
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.insert(0, " ").insert(0, GCD);
        for(int a=2; (double)a<=Math.sqrt(GCD); a++){
            if((double)a == Math.sqrt(GCD)){
                sb1.append(a).append(" ");
            } else if(GCD%a ==0){
                sb1.append(a).append(" ");
                sb2.insert(0, " ").insert(0, GCD/a);
            }
        }
        bw.write(sb1.toString());
        bw.write(sb2.toString());
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