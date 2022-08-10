package step14_numTheory.num_03_2609;

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
                //공통되게 나누어지는 소수는 최대공약수와 최대공배수에 각각 곱해준다.
                if( (num1%divisor ==0) && (num2%divisor==0)){
                    num1 = num1/divisor; num2 = num2/divisor;
                    lcm = lcm*divisor;
                    gcd = gcd*divisor;
                } else if (num1%divisor==0){ // 어느 한쪽만 나눠지는 경우 최대공배수에만 곱한다.
                    num1 = num1/divisor;
                    lcm = lcm*divisor;
                } else if (num2%divisor ==0){
                    num2 = num2/divisor;
                    lcm = lcm*divisor;
                } else { t++; } // 해당 소수로 더이상 분해가 안되면 다음 소수로 검사한다.

            } else if( num1 == 1){ // 어느 한쪽이 1이 되었을 때 나머지 숫자를 최소공배수에 곱한다.
                lcm = lcm*num2;
                break;
            } else if (num2 == 1){
                lcm = lcm*num1;
                break;
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
