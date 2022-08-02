package step14_numTheory.num_3_2609;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int lcm=1, gcd=1;
        //1-10000 사이의 소수배열 저장
        int lastIdx=0;
        int[] primeNumArr = new int[1229];
        for(int i=2; i<10000;i++){
            if(checkPrimeNum(i)){
                primeNumArr[lastIdx] = i;
                lastIdx++;
            }
            if(i%2 == 1){ i++;}
        }
        int divisor;
        int t=0;
        while(t<1229){
            divisor = primeNumArr[t];
            if( (num1==1) && (num2==1)) { break; }
            if( (num1 != 1) && (num2 != 1)){
                if( (num1%divisor ==0) && (num2%divisor==0)){
                    num1 = num1/divisor; num2 = num2/divisor;
                    lcm = lcm*divisor;
                    gcd = gcd*divisor;
                } else if (num1%divisor==0){
                    num1 = num1/divisor;
                    lcm = lcm*divisor;
                } else if (num2%divisor ==0){
                    num2 = num2/divisor;
                    lcm = lcm*divisor;
                } else { t++; }
            } else if( num1 == 1){
                if(num2%divisor==0){
                    num2 = num2/divisor;
                    lcm = lcm*divisor;
                } else { t++; }
            } else if (num2 == 1){
                if(num1%divisor ==0){
                    num1 = num1/divisor;
                    lcm=lcm*divisor;
                } else { t++; }
            }
        }
        bw.write(Integer.toString(gcd));
        bw.newLine();
        bw.write(Integer.toString(lcm));
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
