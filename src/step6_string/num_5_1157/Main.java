package step6_string.num_5_1157;

import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String words = br.readLine();
        int[] arr = new int[32];
        Arrays.fill(arr, 0);
        int temp;
        for(int i = 0; i < words.length(); i++) {
            temp = (int) words.charAt(i)%65;
                arr[temp%32] += 1;
        }
        int most=0;
        int arrIndex=0;
        for(int j = 0; j < 26; j++){
            if(most<arr[j]) {
                most = arr[j];
                arrIndex = j+65;
            }
            else if(most == arr[j]){
                arrIndex = 63;
            }
        }
        bw.write((char)arrIndex);
        bw.flush();
        bw.close();
    }
}
