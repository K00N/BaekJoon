package step11_sort.num_5_1427;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strArr = br.readLine().split("");
        int[] intArr = new int[strArr.length];
        for(int i=0; i< intArr.length; i++){
            intArr[i]=Integer.parseInt(strArr[i]);
        }
        int temp=0;
        int compareIndex=0;
        for(int j=1;j<intArr.length;j++){
            temp=intArr[j];
            compareIndex=j-1;
            while(true){
                if(compareIndex==-1){intArr[0]=temp; break;}
                if(temp>=intArr[compareIndex]){intArr[compareIndex+1]=intArr[compareIndex]; compareIndex--;}
                else if(temp<intArr[compareIndex]){intArr[compareIndex+1]=temp; break;}
            }
        }

        for(int k=0; k<intArr.length;k++){
            bw.write(Integer.toString(intArr[k]));
        }

        bw.flush();
        bw.close();


    }
}
