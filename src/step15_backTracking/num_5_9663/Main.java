package step15_backTracking.num_5_9663;

import java.io.*;

public class Main {

    public static int[][] chessArr;
    public static StringBuilder sb = new StringBuilder();
    public static int count=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        chessArr = new int[N][N];
        dfs(0);
        System.out.println(count);
    }
    public static void dfs(int depth) {
        if (depth == chessArr.length) {
            count++;
            return;
        }

        for(int i=0; i< chessArr.length; i++){
            if(checkPossible(depth, i)){
                ban(depth, i);
                dfs(depth+1);
                unban(depth, i);
            }
        }

    }
    public static boolean checkPossible(int x, int y){
        if(chessArr[x][y] > 0){
            return false;
        }
        return true;
    }
    public static void ban(int x, int y){
        for(int i=0; i< chessArr.length; i++){
            for(int j=0; j< chessArr.length; j++){
                if( x==i || y==j ){
                    chessArr[i][j] += 1;
                } else if( (Math.abs(i-x)<2) && (Math.abs(j-y)<2) ){
                    chessArr[i][j] += 1;
                } else if( (i-j)==(x-y) ){
                    chessArr[i][j] += 1;
                } else if( (i+j)==(x+y) ){
                    chessArr[i][j] += 1;
                }
            }
        }
    }
    public static void unban(int x, int y){
        for(int i=0; i< chessArr.length; i++){
            for(int j=0; j< chessArr.length; j++){
                if( x==i || y==j ){
                    chessArr[i][j] -= 1;
                } else if( (Math.abs(i-x)<2) && (Math.abs(j-y)<2) ){
                    chessArr[i][j] -= 1;
                } else if( (i-j)==(x-y) ){
                    chessArr[i][j] -= 1;
                } else if( (i+j)==(x+y) ){
                    chessArr[i][j] -= 1;
                }
            }
        }
    }
}
