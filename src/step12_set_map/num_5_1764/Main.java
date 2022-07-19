package step12_set_map.num_5_1764;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int setNum = Integer.parseInt(st.nextToken());
        int compareNum = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> setMap = new HashMap<>();
        String str;
        for(int i=0; i<setNum; i++){
            str = br.readLine();
            if(setMap.putIfAbsent(str, 1) != null) {
                setMap.put(str, setMap.get(str)+1);
            }
        }
        int count=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<compareNum;i++){
            str = br.readLine();
            if(setMap.get(str) != null){
                sb.append(str).append(" ");
                count++;
            }
        }
        String[] strArr = new String[count];
        strArr = sb.toString().split(" ");
        Arrays.sort(strArr);
        System.out.println(count);
        for(int i=0; i<count; i++) {
            bw.write(strArr[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
