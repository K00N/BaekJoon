package step16_dynamicProgramming.num_02_9184;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[][][] wArray = new int[21][21][21];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if( (a==-1) && (b==-1) && (c==-1) ){
                break;
            }

            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ");
            sb.append(w(a ,b ,c)).append('\n');


        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    public static int w(int a,int b,int c){
        if( (a<=0) || (b<=0) || (c<=0) ){ return 1; }
        if( (a>20) || (b>20) || (c>20) ){
            wArray[20][20][20] = w(20,20,20);
            return wArray[20][20][20];
        }

        if(wArray[a][b][c] != 0){
            return wArray[a][b][c];
        }


        if( (a<b) && (b<c) ){
            wArray[a][b][c] = w(a,b,c-1)+w(a,b-1,c-1)-w(a,b-1,c);
            return wArray[a][b][c];
        }
        wArray[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);
        return wArray[a][b][c];
    }
}

