package step14_numTheory.num_2_1037;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        // 입력된 숫자들을 배열에 저장하여 sort
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] divisorArr = new int[testCase];
        for(int i=0; i<testCase; i++){
            divisorArr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(divisorArr);

        // 첫 요소와 마지막 요소를 곱하면 N을 구할 수 있다
        int answer=0;
        answer = divisorArr[0]*divisorArr[divisorArr.length-1];

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}
