package test;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int seriesNum = Integer.parseInt(br.readLine());

        String devilNum = "666";
        int front=1;
        int serNum=0;
        String frontString="";
        OuterLoop:
        while(true){
            frontString=Integer.toString(front);
            for(int i=frontString.length()-1; i<0;i--){
                if(frontString.charAt(i)==6){
                    serNum += Math.pow(10, frontString.length()-i);
                    if(seriesNum<serNum){System.out.println(seriesNum-serNum);break OuterLoop;}
                }
            }
            front++;
        }

        bw.write("asd");
        bw.flush();
        bw.close();
    }
}
