package step8_basicMath2.num_6_9020;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        int t=0;
        int lastIdx=0;

        //1-10000 사이의 소수배열 저장
        int[] primeNumArr = new int[1300];
        for(int i=2; i<10000;i++){
            if(checkPrimeNum(i)){
                primeNumArr[lastIdx] = i;
                lastIdx++;
            }
        }
        int n;
        int answer_num1=0, answer_num2=0;

        while(t<testCase){
            n=Integer.parseInt(br.readLine());


            for (int i : primeNumArr) {
                if( i > n/2 ){ break; }
                for (int j : primeNumArr) {
                    if ((i + j) == n) {
                        answer_num1 = i;
                        answer_num2 = j;
                    } else if ((i + j) > n) {
                        break;
                    }
                }
            }
            bw.write(answer_num1+" "+ answer_num2);
            bw.newLine();
            t++;
        }
        bw.flush();
        bw.close();
    }
    public static boolean checkPrimeNum(int n){
        if(n==1){return false;}
        else if(n==2){ return true; }
        if(n%2==0){return false;}
        int i=0;
        while(true){
            if((i*2+3)>(int)Math.sqrt(n)){break;}
            if(n%((i*2)+3)==0){return false;}
            i++;
        }
        return true;
    }
}
