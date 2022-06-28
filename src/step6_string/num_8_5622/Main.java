package step6_string.num_8_5622;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String words = br.readLine();

        String croatia[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int i = 0; i < croatia.length; i++) {
            if (words.contains(croatia[i])) {
                words = words.replace(croatia[i], "1");
            }
        }
        bw.write(Integer.toString(words.length()));
        bw.flush();
        bw.close();
    }
}