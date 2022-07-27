package step8_basicMath2.num_3_11653;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int i=0;
        while(true) {
            if (num % 2 == 0) {
                num = num / 2;
                bw.write("2");
                bw.newLine();
            } else { break; }
        }

        while(true) {
            if(num == 1){ break; }
            if (num % (i * 2 + 3) == 0){
                num = num /(i*2+3);
                bw.write(Integer.toString(i*2+3));
                bw.newLine();
            } else {
                i++;
            }

        }

        bw.flush();
        bw.close();
    }
}
