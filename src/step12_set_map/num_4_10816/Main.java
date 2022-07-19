package step12_set_map.num_4_10816;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int setNum = Integer.parseInt(st.nextToken());

        int[] setArr = new int[setNum];
        st = new StringTokenizer(br.readLine(), " ");

        HashMap<Integer, Integer> setMap = new HashMap<>();
        int temp;
        for(int i=0; i< setNum; i++){
            temp=Integer.parseInt(st.nextToken());
            if(setMap.putIfAbsent(temp, 1) != null) {
                setMap.put(temp, setMap.get(temp)+1);
            }
        }


        int countNum = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<countNum; i++){
            temp = Integer.parseInt(st.nextToken());
            if(setMap.get(temp)== null){
                sb.append(" 0");
            } else {
                sb.append(" ").append(setMap.get(temp));
            }
        }
        System.out.println(sb.toString().trim());
    }
}
