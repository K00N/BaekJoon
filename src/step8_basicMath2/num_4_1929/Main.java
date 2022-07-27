package step8_basicMath2.num_4_1929;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] primeArr = new int[500000];
        int lastIdx=0;
        for(int i=2; i<M; i++){
            if(checkPrimeNum(i)){
                primeArr[lastIdx] = i;
                lastIdx++;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(M<3 && N>1 && (M != 2) ){sb.append("2").append("\n");}
        for(int i=M;i<N+1;i++){
            if(checkPrimeWithArr(i, primeArr, lastIdx)){
                primeArr[lastIdx]=i;
                lastIdx++;
                sb.append(i).append("\n");
            }
            if( i%2==1 ){i++;}
        }
        bw.write(sb.toString());
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
    public static boolean checkPrimeWithArr(int n, int[] primeArr, int lastIdx){
        if(n==1){return false;}
        else if(n==2){ return true; }

        for(int i=0; i<lastIdx;i++){
            if(primeArr[i]>(int)Math.sqrt(n)){ return true;}
            if(n%primeArr[i]==0){
                return false;
            }
        }
        return true;
    }
}
