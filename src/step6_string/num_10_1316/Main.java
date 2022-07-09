package step6_string.num_10_1316;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        String str;
        String strSet = "";
        String[] strArr;
        int count=0;

        for(int i =0; i < repeat; i++){
             strSet = "";
             str =br.readLine();
             str += "0";
             for(int j=0; j < str.length()-1; j++){
                 if(str.charAt(j) != str.charAt(j+1)){strSet += Character.toString(str.charAt(j));}
             }

             strArr = strSet.split("");

             outerLoop:
             for(int k=0; k<strArr.length; k++){
                 for(int l=k+1; l< strArr.length; l++){
                     if (strArr[k].equals(strArr[l])){ count++; break outerLoop;}
                 }
             }
        }

        bw.write(Integer.toString(repeat-count));
        bw.flush();
        bw.close();
    }
}