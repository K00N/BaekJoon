package step16_dynamicProgramming.num_15_9251;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] strArr1 = str.split("");
        str = br.readLine();
        String[] strArr2 = str.split("");
        int[] idxArr = new int[1001];
        int[] lengthArr = new int[1001];
        for(int i=0;i< strArr2.length;i++){
            if(strArr1[0].equals(strArr2[i])){
                idxArr[0] = i;
                lengthArr[0] = 1;
                break;
            }
        }
        for(int i=1; i<strArr1.length; i++){
            for(int j=0; j< strArr2.length; j++){
                if(strArr1[i].equals(strArr2[j])){
                    idxArr[i] = j;
                    lengthArr[i] = 1;
                    for(int k=0; k<i; k++){
                        if(idxArr[k]<idxArr[i]){
                            lengthArr[i] = Math.max(lengthArr[i], lengthArr[idxArr[k]]+1);
                        }
                    }
                }
            }
        }

//        for(int i=0; i< strArr1.length; i++){
//            bw.write(strArr1[i]);
//        }
//        bw.newLine();
//        for(int i=0; i< strArr2.length; i++){
//            bw.write(strArr2[i]);
//        }
//        bw.newLine();
//        for(int i=0; i<10; i++){
//            bw.write(Integer.toString(idxArr[i]));
//        }
//        bw.newLine();
//        for(int i=0; i<10; i++){
//            bw.write(Integer.toString(lengthArr[i]));
//        }
        int maxlength=0;
        for(int i=0; i<lengthArr.length; i++){
            maxlength = Math.max(maxlength, lengthArr[i]);
        }

        Arrays.fill(idxArr, 0);
        Arrays.fill(lengthArr, 0);


        for(int i=0;i< strArr1.length;i++){
            if(strArr2[0].equals(strArr1[i])){
                idxArr[0] = i;
                lengthArr[0] = 1;
                break;
            }
        }
        for(int i=1; i<strArr2.length; i++){
            for(int j=0; j< strArr1.length; j++){
                if(strArr2[i].equals(strArr1[j])){
                    idxArr[i] = j;
                    lengthArr[i] = 1;
                    for(int k=0; k<i; k++){
                        if(idxArr[k]<j){
                            lengthArr[i] = Math.max(lengthArr[i], lengthArr[idxArr[k]]+1);
                        }
                    }
                }
            }
        }
        for(int i=0; i<lengthArr.length; i++){
            maxlength = Math.max(maxlength, lengthArr[i]);
        }
        bw.write(Integer.toString(maxlength));
        bw.flush();
        bw.close();
    }
}
