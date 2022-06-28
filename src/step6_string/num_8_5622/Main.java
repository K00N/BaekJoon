package step6_string.num_8_5622;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String words = br.readLine();
        int alphaNum;
        int sum=0;
        for(int i = 0; i < words.length(); i++){
            alphaNum = (int)words.charAt(i)-65;
            if(alphaNum < 15){ sum += alphaNum/3 +2;}
            else if (alphaNum < 19) { sum += 7;}
            else if (alphaNum < 22) { sum += 8;}
            else { sum += 9;}
        }
        sum += words.length();

        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}