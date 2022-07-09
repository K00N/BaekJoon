package step9_recursive.num_4_2447;

import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int starSize = Integer.parseInt(br.readLine());

        char[][] starArr = new char[starSize][starSize];
        for(int i=0; i<starSize; i++){
            Arrays.fill(starArr[i],'*');
        }

        replaceStars(starArr, starSize, starSize);
        for (int i = 0; i < starSize; i++) {
            for (int j = 0; j < starSize; j++) {
                System.out.print(starArr[i][j]);
            }
            System.out.println("");
        }
    }

    public static int replaceStars(char[][] starArr, int starSize, int cols_rows){
        int center = starSize/3;


        if(center<1) { return 0;}

            for (int i = center; i < center * 2; i++) {
                for (int j = center; j < center * 2; j++) {
                    for(int k =0;k<cols_rows;k+=starSize) {
                        for(int l =0;l<cols_rows;l+=starSize) {
                            starArr[i + k][j + l] = ' ';
                        }
                    }
                }
            }
         replaceStars(starArr, center, cols_rows);
        return 0;
    }
}
