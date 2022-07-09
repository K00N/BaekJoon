package step10_bruteforce.num_4_1018;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[][] chessTable1 = new String[8][8];
        String[][] chessTable2 = new String[8][8];
        String chessLine1 = "BWBWBWBW";
        String chessLine2 = "WBWBWBWB";

        for(int p=0; p< chessTable1.length; p++){
            if(p%2 == 0){
                chessTable1[p] = chessLine1.split("");
                chessTable2[p] = chessLine2.split("");
            } else {
                chessTable1[p] = chessLine2.split("");
                chessTable2[p] = chessLine1.split("");
            }
        }

        String str = br.readLine();
        String[] strArr = str.split(" ");
        int cols = Integer.parseInt(strArr[0]);
        int rows = Integer.parseInt(strArr[1]);
        String[][] board = new String[cols][rows];

        for(int q=0; q<cols; q++){
            board[q] = br.readLine().split("");
        }

        int k;
        int minimum=64;

        for(int i=0;i<cols-7;i++){
            for(int j=0;j<rows-7;j++){
                k=0;

                    for(int a=0; a<8;a++){
                        for(int b=0; b<8; b++){
                            if(!(board[i+a][j+b].equals(chessTable1[a][b]))){k++;}
                        }
                    }

                    if(k<minimum){minimum=k;}
                k=0;
                        for(int a=0; a<8;a++){
                            for(int b=0; b<8; b++){
                                if(!(board[i+a][j+b].equals(chessTable2[a][b]))){k++;}
                            }
                        }

                        if(k<minimum){minimum=k;}

            }
        }

        bw.write(Integer.toString(minimum));
        bw.flush();
        bw.close();
    }


}
