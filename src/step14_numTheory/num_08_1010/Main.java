package step14_numTheory.num_08_1010;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] modArr = new int[497];
            modArr[0]=1;
            int start=0, end=0;
            for(int i=1; i<=31; i++){
                end = i*(i+1)/2;
                start = end - i + 1;
                for(int j=start; j<=end; j++){
                    if( (j==start) || (j==end)){
                        modArr[j] = 1;
                    } else{
                        modArr[j] = (modArr[j-i] + modArr[j-i+1]);
                    }
                }
            }
            int testCase = Integer.parseInt(br.readLine());
            int t=0;
            int n, k;
            while(t<testCase){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                k = Integer.parseInt(st.nextToken());
                n = Integer.parseInt(st.nextToken());
                n++;
                int Idx = (n*(n+1)/2) - n + 1 + k;
                bw.write(Integer.toString(modArr[Idx]));
                bw.newLine();
                t++;
            }
            bw.flush();
            bw.close();
        }
}
