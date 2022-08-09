package step14_numTheory.num_10_9375;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int t=0;
        StringTokenizer st;
        int clothCase;
        String clothType;
        while(t<testCase) {
            clothCase = Integer.parseInt(br.readLine());
            HashMap<String, Integer> clothMap = new HashMap<>();
            for(int i =0; i<clothCase; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                clothType = st.nextToken();
                if( clothMap.containsKey(clothType) ) {
                    clothMap.put(clothType, clothMap.get(clothType)+1);
                } else {
                    clothMap.put(clothType, 1);
                }
            }
            int answer=1;
            for(int c : clothMap.values()){
                answer *= c+1;
            }
            bw.write(Integer.toString(answer-1));
            bw.newLine();
            t++;
        }

        bw.flush();
        bw.close();
    }
}
