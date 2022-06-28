package step7_basicMath1.num_1_1712;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] strArr = str.split(" ");
        int BEP=0;
        int fixedCost = Integer.parseInt(strArr[0]);
        int variableCost = Integer.parseInt(strArr[1]);
        int salesCost = Integer.parseInt(strArr[2]);
        if(variableCost >= salesCost){
            BEP = -1;
        }else {
            BEP = fixedCost/(salesCost-variableCost) + 1;
        }
        bw.write(Integer.toString(BEP));
        bw.flush();
        bw.close();
    }
}

