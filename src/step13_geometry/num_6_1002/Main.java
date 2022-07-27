package step13_geometry.num_6_1002;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int testCase = Integer.parseInt(st.nextToken());

        int x_a=0, y_a=0, r_a = 0;
        int x_b=0, y_b=0, r_b = 0;
        int t=0;
        double distance=0;
        int radiusSum=0;
        int radiusSubtract=0;
        while(t<testCase) {
                st = new StringTokenizer(br.readLine(), " ");
                x_a = Integer.parseInt(st.nextToken());
                y_a = Integer.parseInt(st.nextToken());
                r_a = Integer.parseInt(st.nextToken());
                x_b = Integer.parseInt(st.nextToken());
                y_b = Integer.parseInt(st.nextToken());
                r_b = Integer.parseInt(st.nextToken());

            // 상황판별 변수들 초기화
            distance = Math.sqrt( Math.pow(Math.abs(x_a-x_b),2) + Math.pow(Math.abs(y_a - y_b), 2) );
            radiusSum = r_a + r_b;
            radiusSubtract = Math.abs(r_a - r_b);
            // 무한개일 때 (원이 같을 때)
            if( (x_a == x_b) && (y_a == y_b) && (r_a == r_b) ) {bw.write("-1"); }
            // 0개일 때 (distance가 반지름의 합보다 클 때)
            else if((double)radiusSum < distance){ bw.write("0"); }
            else if((double)radiusSubtract > distance){ bw.write("0"); }
            // 1일 때 (접할 때) (distance가 반지름의 합이나 반지름의 차와 같을 때)
            else if((double)radiusSum == distance){ bw.write("1");}
            else if((double)radiusSubtract == distance){ bw.write("1"); }
            // 2개 일 때(distance가 반지름의 합보다 작을 때)
            else if((double)radiusSum > distance){ bw.write("2"); }

            bw.newLine();
            t++;
        }
        bw.flush();
        bw.close();
    }
}
