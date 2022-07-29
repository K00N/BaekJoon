package step8_basicMath2.num_5_4948;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int limit = 123456*2 +1;
        int[] primeArr = new int[limit];
        int count=0;
        for(int i=1; i<primeArr.length;i++){
            if(checkPrimeNum(i)){
                count++;
            }
            primeArr[i] = count;
        }
        int N=0;
        while(true){
            N = Integer.parseInt(br.readLine());
            if(N==0){ break; }
            sb.append(primeArr[N*2]-primeArr[N]).append("\n");
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

}