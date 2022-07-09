package step7_basicMath1.num_4_2869;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] strArr = str.split(" ");
        int climbA = Integer.parseInt(strArr[0]);
        int slipB = Integer.parseInt(strArr[1]);
        int heightV = Integer.parseInt(strArr[2]);

        heightV -= climbA;
        int day = heightV/(climbA-slipB);

        if(day*(climbA-slipB) == heightV){ day += 1;}
        else {day += 2;}

        bw.write(Integer.toString(day));
        bw.flush();
        bw.close();
    }
}
