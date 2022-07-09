package step10_bruteforce.num_2_2231;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int numberCount = str.length();
        int decomposeSum = Integer.parseInt(str);
        int testRange = numberCount * 9;
        String testCase="";
        int addNum;
        int answer=1000000;

        for(int i = decomposeSum-testRange; i<decomposeSum; i++){
            testCase = Integer.toString(i);
            addNum = i;
            for(int j=0; j<testCase.length(); j++){ addNum += Character.getNumericValue(testCase.charAt(j)); }
            if( (addNum==decomposeSum) && (i<answer)){
                answer = i;
            }
        }

        if(answer==1000000){answer=0;}
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}
