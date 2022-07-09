package step10_bruteforce.num_5_1436;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int seriesNum = Integer.parseInt(br.readLine());

        int count = 0;
        int movieNum = 665;
        while(count<seriesNum){
            movieNum++;
            if(Integer.toString(movieNum).contains("666")){
                count++;
            }
        }
        bw.write(Integer.toString(movieNum));
        bw.flush();
        bw.close();
    }
}
