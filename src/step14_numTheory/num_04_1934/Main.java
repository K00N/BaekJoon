package step14_numTheory.num_04_1934;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());

        int lcm;
        //1-45000 사이의 소수배열 저장
        int lastIdx=0;
        int[] primeNumArr = new int[4675];
        for(int i=2; i<45000;i++){
            if(checkPrimeNum(i)){
                primeNumArr[lastIdx] = i;
                lastIdx++;
            }
            if(i%2 == 1){ i++;}
        }

        int divisor;
        int idx=0;
        int t=0;
        int num1, num2;
        StringBuilder sb = new StringBuilder();
        while(t<testCase){
            lcm=1;
            idx=0;
            st = new StringTokenizer(br.readLine(), " ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            while(idx<4675) {
                divisor = primeNumArr[idx];
                if ((num1 == 1) && (num2 == 1)) {
                    break;
                }
                if ((num1 != 1) && (num2 != 1)) {
                    if ((num1 % divisor == 0) && (num2 % divisor == 0)) {
                        num1 = num1 / divisor;
                        num2 = num2 / divisor;
                        lcm = lcm * divisor;
                    } else if (num1 % divisor == 0) {
                        num1 = num1 / divisor;
                        lcm = lcm * divisor;
                    } else if (num2 % divisor == 0) {
                        num2 = num2 / divisor;
                        lcm = lcm * divisor;
                    } else {
                        idx++;
                    }
                } else if( num1 == 1){ // 어느 한쪽이 1이 되었을 때 나머지 숫자를 최소공배수에 곱한다.
                    lcm = lcm*num2;
                    break;
                } else if (num2 == 1){
                    lcm = lcm*num1;
                    break;
                }
            }
            sb.append(lcm).append("\n");
            t++;
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
