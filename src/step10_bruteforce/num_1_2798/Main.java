package step10_bruteforce.num_1_2798;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] strArr = str.split(" ");

        int testCase = Integer.parseInt(strArr[0]);
        int blackJackNum = Integer.parseInt(strArr[1]);

        str = br.readLine();
        String[] strNumArr = str.split(" ");
        int[] numArr = new  int[strNumArr.length];
        for(int l=0; l < strNumArr.length; l++){
            numArr[l]=Integer.parseInt(strNumArr[l]);
        }

        int addNum=0;
        int subtractNum=blackJackNum;

        bruteLoop:
        for(int i=0; i < numArr.length-2;i++) {
            for(int j=i+1; j<numArr.length-1; j++){
                for(int k=j+1; k<numArr.length;k++){
                    addNum = numArr[i] + numArr[j] + numArr[k];
                    if(addNum == blackJackNum){ subtractNum=0; break bruteLoop;}
                    if ((blackJackNum-addNum)>0 && subtractNum>(blackJackNum-addNum)){ subtractNum = blackJackNum - addNum;}
                }
            }
        }

        bw.write(Integer.toString(blackJackNum-subtractNum));
        bw.flush();
        bw.close();
    }
}
