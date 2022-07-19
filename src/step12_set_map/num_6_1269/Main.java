package step12_set_map.num_6_1269;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int setNum_A = Integer.parseInt(st.nextToken());
        int setNum_B = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<setNum_A; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }

        int count=0;
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<setNum_B; i++){
            if(!setA.add(Integer.parseInt(st.nextToken()))){ count++; }
        }
        bw.write(Integer.toString(setNum_A+setNum_B-count*2));
        bw.flush();
        bw.close();
    }
}
