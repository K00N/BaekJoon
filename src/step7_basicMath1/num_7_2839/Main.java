package step7_basicMath1.num_7_2839;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int weight = Integer.parseInt(br.readLine());
        int answer=-1;

        if(weight%5==0){
            answer=weight/5;
        }else {
            for (int i = 1; i < 1700; i++) {
                weight -= 3;
                if (weight < 0) {
                    break;
                }
                if (weight == 0) {
                    answer = i;
                }
                if (weight % 5 == 0) {
                    answer = i + weight / 5;
                    break;
                }

            }
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}
