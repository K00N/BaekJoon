package step11_sort.num_1_2750;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        int[] intArr = new int[testCase];
        for(int i=0; i<testCase; i++){
            intArr[i] = Integer.parseInt(br.readLine());
        }

        int temp;
        int compareIndex;

        for(int j=1;j<intArr.length;j++){
            temp=intArr[j];
            compareIndex=j-1;
            while(true){
                if(compareIndex==-1){intArr[0]=temp; break;}
                if(temp<intArr[compareIndex]){intArr[compareIndex+1]=intArr[compareIndex]; compareIndex--;}
                else if(temp>intArr[compareIndex]){intArr[compareIndex+1]=temp; break;}
            }
        }

        for(int k=0;k<intArr.length;k++){
            System.out.println(intArr[k]);
        }

    }
}
