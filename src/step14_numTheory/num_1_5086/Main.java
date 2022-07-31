package step14_numTheory.num_1_5086;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a=0, b=0;
        while(true){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if( (a==0) && (b==0)){ break; }
            if( (a>b) && (a%b==0)){
                bw.write("multiple");
                bw.newLine();
            } else if((a<b)&&(b%a==0)){
                bw.write("factor");
                bw.newLine();
            } else  {
                bw.write("neither");
                bw.newLine();
            }

        }

        bw.flush();
        bw.close();
    }

}
