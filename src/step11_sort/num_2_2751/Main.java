package step11_sort.num_2_2751;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int temp=0;
        int lastIndex=testCase-1;
        int[] intArr = new int[testCase];
        for(int i=0; i<testCase; i++){
            intArr[i] = Integer.parseInt(br.readLine());
        }

        for(int j=intArr.length-1; j>0;j--){
            upHeapify(intArr, j);
        }
        while(lastIndex>0) {
            temp = intArr[0];
            intArr[0] = intArr[lastIndex];
            intArr[lastIndex] = temp;
            lastIndex--;
            downHeapify(intArr, lastIndex, 0);
        }
        for(int k=0;k<intArr.length; k++){
            System.out.println(intArr[k]);
        }
    }

    public  static void upHeapify(int[] intArr, int index){
        int temp;
        if(index<1){return;}
        if(index%2==0){
            if(intArr[(index-2)/2]<intArr[index]){
                temp=intArr[index];
                intArr[index] = intArr[(index-2)/2];
                intArr[(index-2)/2]=temp;
                upHeapify(intArr, (index-2)/2);
                downHeapify(intArr, intArr.length-1, index);
            }
        } else {
            if(intArr[(index-1)/2]<intArr[index]){
                temp=intArr[index];
                intArr[index] = intArr[(index-1)/2];
                intArr[(index-1)/2]=temp;
                upHeapify(intArr, (index-1)/2);
                downHeapify(intArr, intArr.length-1, index);
            }
        }
    }

    public  static void downHeapify(int[] intArr, int lastIndex, int index){
        int temp;
        int leftNode=index*2+1;
        int rightNode=index*2+2;
        if(leftNode>lastIndex){return;}
        if(leftNode==lastIndex){
            if(intArr[leftNode]>intArr[index]){
                temp = intArr[leftNode];
                intArr[leftNode] = intArr[index];
                intArr[index] = temp;
            }
            return;
        }
        if(intArr[rightNode]<intArr[leftNode]){
            if(intArr[leftNode]>intArr[index]) {
                temp = intArr[leftNode];
                intArr[leftNode] = intArr[index];
                intArr[index] = temp;
                downHeapify(intArr, lastIndex, leftNode);
            }
        } else{
            if(intArr[rightNode]>intArr[index]) {
                temp = intArr[rightNode];
                intArr[rightNode] = intArr[index];
                intArr[index] = temp;
                downHeapify(intArr, lastIndex, rightNode);
            }
        }
    }
}
