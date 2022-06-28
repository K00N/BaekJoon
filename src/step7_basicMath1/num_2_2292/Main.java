package step7_basicMath1.num_2_2292;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int roomNum = Integer.parseInt(br.readLine());
        int route=1;
        int value=2;
        while(value <= roomNum){
            value += 6*route;
            route++;
        }
        if(roomNum == 1){route =1;}
        bw.write(Integer.toString(route));
        bw.flush();
        bw.close();
    }
}