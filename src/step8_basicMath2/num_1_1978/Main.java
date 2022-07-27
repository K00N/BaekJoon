package step8_basicMath2.num_1_1978;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count=0;
        for(int i=0; i<testCase; i++){
            if(checkPrimeNum(Integer.parseInt(st.nextToken()))) {
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
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
