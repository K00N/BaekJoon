package step14_numTheory.num_01_5086;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a=0, b=0;
        //
        while(true){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if( (a==0) && (b==0)){ break; }
            if( (a>b) && (a%b==0)){ // a가 b보다 클 경우 모듈러 연산이 0이라면 배수
                bw.write("multiple");
                bw.newLine();
            } else if((a<b)&&(b%a==0)){ // a가 b보다 작을경우 모듈러 연산이 0이라면 약수
                bw.write("factor");
                bw.newLine();
            } else  { // 나머지들은 모두 배수와 약수가 아님
                bw.write("neither");
                bw.newLine();
            }

        }

        bw.flush();
        bw.close();
    }

}
