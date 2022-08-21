package step15_backTracking.num_6_2580;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[][] sudokuArr = new int[9][9];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                sudokuArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);

    }

    public static void dfs(int x, int y) {
        if(x==9){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(sudokuArr[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }
        if(y == 9){
            dfs(x+1, 0);
            return;
        }
        if(sudokuArr[x][y]==0) {
            for(int i = 1; i < 10; i++) {
                if(checkOverlap(x, y, i)){
                    sudokuArr[x][y] = i;
                    dfs(x,y+1);
                }
            }
            sudokuArr[x][y] = 0;
            return;
        }

        dfs(x, y+1);
    }

    public  static boolean checkOverlap(int x, int y, int checkNum){

        for(int i=0;i<9;i++){
            if(checkNum == sudokuArr[x][i]){
                return false;
            }
        }

        for(int i=0;i<9;i++){
            if(checkNum == sudokuArr[i][y]){
                return false;
            }
        }
        int block_x = (x/3)*3;
        int block_y = (y/3)*3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(checkNum == sudokuArr[block_x+i][block_y+j]){
                    return false;
                }
            }
        }

        return true;
    }
}