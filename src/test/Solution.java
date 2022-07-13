package test;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int repeat = Integer.parseInt(br.readLine().trim());
        int temp;
        int n=1;
        int tempBiggest=0;
        int biggest=0;
        int answer=0;
        int size;

        while(n<=repeat){

            size = Integer.parseInt(br.readLine().trim());

            String[][] landArr = new String[size][size];
            for(int i=0;i<size;i++){landArr[i] = br.readLine().trim().split(" ");}

            String[][] landArr_c = new String[size][size];

            for(int a=1;a<size;a++) {
                for (int b = 0; b < size; b++) {
                tempBiggest=Integer.parseInt(landArr[a][b]);
                if(biggest<tempBiggest){biggest=tempBiggest;}
                }
            }

            //System.out.println("Biggest Value : " + biggest);

            for(int y=0;y<biggest;y++){
                for(int j=0;j<size;j++){
                    System.arraycopy(landArr[j], 0, landArr_c[j], 0, size);
                }
                temp=countSector(landArr_c, y);
                //System.out.println(y+"year count : " + temp);
                if(answer<temp){answer=temp;}
            }
            System.out.println("#"+n+" " + answer);
            n++;
        }
    }

    public static int countSector(String[][] landArr, int year){
        int count=0;
        for(int i=0;i<landArr.length;i++){
            for(int j=0; j< landArr.length; j++){
                if(Integer.parseInt(landArr[i][j])>year){
                    count++;
                    System.out.println("Present Year is "+year);
                    System.out.println("Present Count is "+count);
                    check4way(landArr, i, j, year);
                }
            }
        }
        return count;
    }

    public static void check4way(String[][] landArr, int i, int j, int year){
        landArr[i][j]="0";

        for(int a=0; a<landArr.length; a++){
            for(int b=0; b< landArr.length; b++){
                System.out.print(landArr[a][b]);
            }
            System.out.println("");
        }
        System.out.println("============================");

        if(j != landArr.length-1){
            if(Integer.parseInt(landArr[i][j+1])>year){
                check4way(landArr, i,j+1, year);
            }
        }
        if(i != landArr.length-1){
            if(Integer.parseInt(landArr[i+1][j])>year){
                check4way(landArr, i+1,j, year);
            }
        }
        if(j>0){
            if(Integer.parseInt(landArr[i][j-1])>year){
                check4way(landArr, i,j-1, year);
            }
        }
        if(i>0){
            if(Integer.parseInt(landArr[i-1][j])>year){
                check4way(landArr, i-1, j, year);
            }
        }
    }
}


