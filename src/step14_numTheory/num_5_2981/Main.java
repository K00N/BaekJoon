package step14_numTheory.num_5_2981;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

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
/*        for(int i=0; i< subArr.length; i++){
            bw.write(Integer.toString(subArr[i]));
        }
        bw.newLine();
        bw.flush();*/

        int[] primeNumArr = new int[subArr[subArr.length-1]/2+1];
        int lastIdx=0;
        for(int i=2; i<=subArr[subArr.length-1]; i++){
            if(checkPrimeNum(i)){
                primeNumArr[lastIdx] = i;
                lastIdx++;
            }
            if(i%2 == 1){ i++;}
        }
/*        for(int i=0; i< primeNumArr.length; i++){
            bw.write(Integer.toString(primeNumArr[i]));
        }
        bw.newLine();
        bw.flush();*/



        int GCD =subArr[0];

        for(int k=1; k< subArr.length; k++){
            GCD = getGCD(GCD, subArr[k], primeNumArr);
        }
        for(int a=2; a<=GCD; a++){
            if(GCD%a ==0){
                bw.write(Integer.toString(a)+" ");
            }
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
    public static int getGCD(int num1, int num2, int[] primeNumArr){
        int divisor=0;
        int t=0;
        int gcd=1;
        while(t<primeNumArr.length){
            divisor = primeNumArr[t];
            if( (num1==1) || (num2==1)) { break; }

            if( (num1%divisor==0) && (num2%divisor==0)){
                num1 = num1/divisor; num2 = num2/divisor;
                gcd = gcd*divisor;
            } else if( (num1%divisor)==0){
                num1 = num1 / divisor;
            } else if ( (num2&divisor)==0){
                num2 = num2 / divisor;
            } else {
                t++;
            }
        }
        return gcd;
    }

}
