package step8_basicMath2.num2_prime_2581;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int primeSum=0;
        int minimum=Integer.MAX_VALUE;
        for(int i=m; i<=n;i++){
            if(checkPrimeNum(i)){
                primeSum += i;
                if(minimum == Integer.MAX_VALUE){ minimum=i; }
            }
        }
        if(minimum == Integer.MAX_VALUE){ minimum = -1; }
        if(primeSum != 0) {
            System.out.println(primeSum);
        }
        System.out.println(minimum);
    }

    public static boolean checkPrimeNum(int n){
        int i=2;
        while(true){
            if(n==1){return false;}
            if(i==n){break;}
            if(n%i==0){return false;}
            i++;
        }
        return true;
    }
}
