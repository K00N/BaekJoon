package justtest;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int seriesNum = Integer.parseInt(br.readLine());

        String str = Integer.toString(seriesNum);

        bw.write(Integer.toString(str.indexOf("6")));
        bw.flush();
        bw.close();
    }
}

