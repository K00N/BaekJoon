package step12_set_map.num_7_11478;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        HashSet<String> strHashSet = new HashSet<>();
        int j=1;
        int count=0;
        while(true){
            for(int i=0; i<str.length();i++) {
                if(strHashSet.add(str.substring(i,i+j))){
                    count++;
                };
                if( (i+j) == str.length()){ break; }
            }
            if(j==str.length()){break;}
            j++;
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
