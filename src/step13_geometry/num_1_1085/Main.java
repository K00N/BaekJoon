package step13_geometry.num_1_1085;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int x_s;
        int y_s;
        int answer;
        if(x < Math.abs(x-w)){ x_s = x; }
        else { x_s = Math.abs(x-w); }
        if(y < Math.abs(y-h)){ y_s = y; }
        else { y_s = Math.abs(y-h); }

        if( x_s < y_s ){ answer = x_s; }
        else { answer = y_s; }

        System.out.println(answer);
    }
}
