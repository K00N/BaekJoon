package step13_geometry.num_2_3009;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x_a, x_b, x_c;
        int y_a, y_b, y_c;
        int answer_x, answer_y;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        x_a = Integer.parseInt(st.nextToken());
        y_a = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        x_b = Integer.parseInt(st.nextToken());
        y_b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        x_c = Integer.parseInt(st.nextToken());
        y_c = Integer.parseInt(st.nextToken());

        if(x_a == x_b){
            answer_x = x_c;
        } else if(x_a == x_c){
            answer_x = x_b;
        } else {
            answer_x = x_a;
        }

        if(y_a == y_b){
            answer_y = y_c;
        } else if (y_a == y_c){
            answer_y = y_b;
        } else {
            answer_y = y_a;
        }

        bw.write(Integer.toString(answer_x));
        bw.write(" ");
        bw.write(Integer.toString(answer_y));
        bw.flush();
        bw.close();
    }
}
