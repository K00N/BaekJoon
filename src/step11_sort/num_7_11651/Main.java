package step11_sort.num_7_11651;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        int[][] coordinatesArr = new int[testCase][2];

        String[] strArr = new String[2];
        for(int i=0; i<testCase; i++){
            strArr = br.readLine().split(" ");
            coordinatesArr[i][1]=Integer.parseInt(strArr[0]);
            coordinatesArr[i][0]=Integer.parseInt(strArr[1]);
        }

        Arrays.sort(coordinatesArr, (e1, e2)->{
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });
        for(int i = 0; i < testCase; i++) {
            System.out.println(coordinatesArr[i][1] + " " + coordinatesArr[i][0]);
        }

    }
}