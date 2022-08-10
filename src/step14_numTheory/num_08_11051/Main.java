package step14_numTheory.num_08_11051;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] baseArr = new int[501502];
        baseArr[0]=1;
        int start=0, end=0;
        for(int i=1; i<=1001; i++){
            end = i*(i+1)/2;
            start = end - i + 1;
            for(int j=start; j<=end; j++){
                if( (j==start) || (j==end)){
                    baseArr[j] = 1;
                } else{
                    baseArr[j] = (baseArr[j-i] + baseArr[j-i+1])%10007;
                }
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        n++;
        int Idx = (n*(n+1)/2) - n + 1 + k;
        bw.write(Integer.toString(baseArr[Idx]));
        bw.flush();
        bw.close();
    }
}
