package step13_geometry.num_4_2477;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] areaArr = new int[6][2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int multiple = Integer.parseInt(st.nextToken());
        for(int i=0; i<6; i++){
            st = new StringTokenizer(br.readLine(), " ");
            areaArr[i][0] = Integer.parseInt(st.nextToken());
            areaArr[i][1] = Integer.parseInt(st.nextToken());
        }
        int a, b, c, d;
        int a_v, b_v, c_v, d_v;
        int area=0;
        for(int j=0; j<6; j++){
            a = areaArr[j%6][0];
            a_v = areaArr[j%6][1];
            b = areaArr[(j+1)%6][0];
            b_v = areaArr[(j+1)%6][1];
            c = areaArr[(j+2)%6][0];
            c_v = areaArr[(j+2)%6][1];
            d = areaArr[(j+3)%6][0];
            d_v = areaArr[(j+3)%6][1];
            if( (a==c) && (b==d) ){
                area = (a_v+c_v)*(b_v+d_v) - (b_v*c_v);
            }
        }
        int answer;
        answer = area * multiple;
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}
