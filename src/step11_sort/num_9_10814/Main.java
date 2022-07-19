package step11_sort.num_9_10814;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        StringBuilder[] strbuild = new StringBuilder[201];

        for(int i=0;i<strbuild.length;i++){
            strbuild[i] = new StringBuilder();
        }

        String[] strArr=new String[2];
        int age;

        for(int j=0; j<testCase; j++){
            strArr = br.readLine().split(" ");
            age = Integer.parseInt(strArr[0]);
            strbuild[age].append(strArr[1]+" ");
        }

        for(int k=1;k<strbuild.length;k++) {
            if (strbuild[k].toString() == "") {}
            else {
                strArr=strbuild[k].toString().split(" ");
                for(int l=0;l<strArr.length;l++){
                    bw.write(Integer.toString(k)+" ");
                    bw.write(strArr[l]);
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
