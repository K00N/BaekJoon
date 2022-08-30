package step16_dynamicProgramming.num_09_1463;

import java.io.*;

public class Main {
    public static int count=0;
    public static int[] countArr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        countArr = new int[n+1];

        bw.write(Integer.toString(operator(n)));
        bw.flush();
        bw.close();
    }
    public static int operator(int n){
        if(n==1){return 0;}
        if(countArr[n] == 0){
            if(n%6==0){
                countArr[n] = Math.min(operator(n/3), Math.min(operator(n/2), operator(n-1)))+1;
                return countArr[n];
            } else if( n%3 == 0){
                countArr[n] = Math.min(operator(n/3), operator(n-1))+1;
                return countArr[n];
            } else if( n%2 == 0){
                countArr[n] = Math.min(operator(n/2), operator(n-1))+1;
                return countArr[n];
            } else{
                countArr[n] = operator(n-1)+1;
                return countArr[n];
            }
        }
        return countArr[n];
    }
}