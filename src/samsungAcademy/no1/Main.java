package samsungAcademy.no1;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        while(repeat>0){
            int size = Integer.parseInt(br.readLine());
            String[][] landArr = new String[size][size];
            for(int i=0;i<size;i++){landArr[i] = br.readLine().split(" ");}
            for(int y=1;y<101;y++){

            }
            repeat--;
        }
        bw.flush();
        bw.close();

    }
    public static void countSector(String[][] landArr, int year){

    }
    public static void check4way(String[][] landArr, int i, int j, int year){
        if(i>0){}
    }
}








