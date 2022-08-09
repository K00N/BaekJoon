package step14_numTheory.num_12_2004;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] binomialArr = new int[3];
        binomialArr[0] = n;
        binomialArr[1] = m;
        binomialArr[2] = n-m;
        int[] nmfiveArr = new int[3];
        int temp;
        for(int i=0; i<binomialArr.length; i++) {
             temp = binomialArr[i];
             while(temp>4){
                 nmfiveArr[i] += temp/5;
                 temp /= 5;
             }
        }
        int[] nmtwoArr = new int[3];
        for(int i=0; i<binomialArr.length; i++) {
            temp = binomialArr[i];
            while(temp>1){
                nmtwoArr[i] += temp/2;
                temp /= 2;
            }
        }
        int answer = Math.min(nmfiveArr[0] - nmfiveArr[1] - nmfiveArr[2],nmtwoArr[0]-nmtwoArr[1]-nmtwoArr[2]);
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}
