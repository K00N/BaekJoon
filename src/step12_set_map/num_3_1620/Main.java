package step12_set_map.num_3_1620;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int setNum = Integer.parseInt(st.nextToken());
        int quizNum = Integer.parseInt(st.nextToken());

        String[] setArr = new String[setNum];
        for(int i=0; i<setNum; i++){ setArr[i] = br.readLine(); }

        String[] quizArr = new String[quizNum];
        for(int i=0; i<quizNum; i++){ quizArr[i]= br.readLine(); }

        HashMap<String, Integer> pokemonBookMap = new HashMap<>();
        int idx=1;
        for(String x : setArr){pokemonBookMap.put(x, idx); idx++;}

        for(int i=0;i<quizNum; i++){
            if((int)quizArr[i].charAt(0)<58){
                bw.write(setArr[Integer.parseInt(quizArr[i])-1]);
                bw.newLine();
            } else{
                bw.write(Integer.toString(pokemonBookMap.get(quizArr[i])));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
