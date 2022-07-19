package step12_set_map.num_2_14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int setNum = Integer.parseInt(st.nextToken());
        int compareNum = Integer.parseInt(st.nextToken());

        String[] setArr = new String[setNum];
        for(int i=0; i<setNum; i++){ setArr[i] = br.readLine(); }

        String[] compareArr = new String[compareNum];
        for(int i=0; i<compareNum; i++){ compareArr[i]= br.readLine(); }



        Arrays.sort(setArr);
        Arrays.sort(compareArr);
        int count=0;
        int idx=0;
        for(int i=0; i<compareNum; i++){
            for(int j=idx; j<setNum; j++){
                if(compareArr[i].compareTo(setArr[j])==0){count++;idx=j;break;}
                if(compareArr[i].compareTo(setArr[j])<0){idx=j; break;}
            }
        }
        System.out.println(count);
    }
}
