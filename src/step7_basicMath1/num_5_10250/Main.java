package step7_basicMath1.num_5_10250;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        String roomNum="";
        int height;
        int guest;
        int heightNum;
        int weightNum;

        for(int i=0; i < testCase; i++) {
            height = 0;
            guest = 0;
            weightNum = 0;
            String str = br.readLine();
            String[] strArr = str.split(" ");
            height = Integer.parseInt(strArr[0]);
            guest = Integer.parseInt(strArr[2]);

            if(i>0){roomNum += "\n";}

            heightNum = guest % height;
            weightNum = guest / height + 1;

            if(heightNum == 0){ heightNum = height; weightNum -= 1;}
            roomNum += Integer.toString(heightNum);

            if (weightNum < 10) {
                roomNum += "0" + Integer.toString(weightNum);
            } else {
                roomNum += Integer.toString(weightNum);
            }

        }
        bw.write(roomNum);
        bw.flush();
        bw.close();
    }
}
