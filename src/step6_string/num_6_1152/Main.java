package step6_string.num_6_1152;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String words = br.readLine();
        StringTokenizer st = new StringTokenizer(words, " ");

        bw.write(Integer.toString(st.countTokens()));
        bw.flush();
        bw.close();
    }
}