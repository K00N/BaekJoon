package step13_geometry.num_7_1004;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), "");
        int testCase = Integer.parseInt(st.nextToken());
        int t=0;
        int x_s=0, y_s=0, x_e=0, y_e=0;
        int planetNum;
        int planet_x, planet_y, planet_r;
        while(t<testCase){
            st = new StringTokenizer(br.readLine(), " ");
            x_s = Integer.parseInt(st.nextToken());
            y_s = Integer.parseInt(st.nextToken());
            x_e = Integer.parseInt(st.nextToken());
            y_e = Integer.parseInt(st.nextToken());
            // 시작점 도착점 입력


            planetNum = Integer.parseInt(br.readLine());
            int count=0;
            double distance_s, distance_e;
            for(int i=0; i<planetNum;i++){
                st = new StringTokenizer(br.readLine(), " ");
                planet_x = Integer.parseInt(st.nextToken());
                planet_y = Integer.parseInt(st.nextToken());
                planet_r = Integer.parseInt(st.nextToken());
                distance_s = Math.sqrt( Math.pow(Math.abs(x_s-planet_x), 2) + Math.pow(Math.abs(y_s-planet_y),2) );
                distance_e = Math.sqrt( Math.pow(Math.abs(x_e-planet_x), 2) + Math.pow(Math.abs(y_e-planet_y),2) );
                if( (distance_s<planet_r) && (distance_e<planet_r) ){
                    continue;
                } else if(distance_s<planet_r){
                    count++;
                } else if(distance_e<planet_r){
                    count++;
                }
            }
            bw.write(Integer.toString(count));
            bw.newLine();
            t++;
        }
        bw.flush();
        bw.close();
    }
}
