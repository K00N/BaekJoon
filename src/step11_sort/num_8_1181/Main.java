package step11_sort.num_8_1181;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        String[] strArr = new String[testCase];

        for(int i=0; i<testCase; i++){
            strArr[i]= br.readLine();
        }

        Arrays.sort(strArr, (str1, str2)->{
            if(str1.length()==str2.length()){
                return str1.compareTo(str2);
            } else{
                return str1.length()-str2.length();
            }
        });

        for(int j=0;j<testCase-1;j++){
            if(!strArr[j].equals(strArr[j+1])){
                bw.write(strArr[j]);
                bw.newLine();
            }
        }
        bw.write(strArr[testCase-1]);
        bw.flush();
        bw.close();
    }
}
