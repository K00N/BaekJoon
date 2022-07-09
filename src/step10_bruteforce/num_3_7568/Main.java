package step10_bruteforce.num_3_7568;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());
        String str;
        String[] strArr;
        int[] w_and_h_Arr = new int[caseNum*2];

        for(int i=0; i<caseNum; i++){
            str = br.readLine();
            strArr = str.split(" ");
            w_and_h_Arr[i*2]=Integer.parseInt(strArr[0]);
            w_and_h_Arr[i*2+1]=Integer.parseInt(strArr[1]);
        }

        int[] rankingTable = new int[caseNum];
        int k;
        for(int testCase=0;testCase<caseNum;testCase++){
            k=0;
            for(int compareCase=0; compareCase<caseNum;compareCase++){
                if(w_and_h_Arr[testCase*2]<w_and_h_Arr[compareCase*2]
                        && w_and_h_Arr[testCase*2+1]<w_and_h_Arr[compareCase*2+1]){ k++; }
            }
            rankingTable[testCase] = k+1;
        }

        for(int m=0; m<caseNum; m++){
            bw.write(Integer.toString(rankingTable[m]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
