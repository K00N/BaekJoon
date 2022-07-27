package step13_geometry.num_5_3053;

import java.io.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double radius = Integer.parseInt(br.readLine());

        BigDecimal Uclid = new BigDecimal(radius*radius);
        double Taxi;
        BigDecimal pi = new BigDecimal(Math.PI);
        Uclid = Uclid.multiply(pi);
        Taxi = Math.pow(radius*2, 2) /2;
        bw.write(Uclid.toString());
        bw.newLine();
        bw.write(Double.toString(Taxi));
        bw.flush();
        bw.close();
    }
}
