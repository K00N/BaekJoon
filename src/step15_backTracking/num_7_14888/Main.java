package step15_backTracking.num_7_14888;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] numArr;
    public static int[] operatorArr = new int[4];
    public static int MAX=Integer.MIN_VALUE;
    public static int MIN=Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st= new StringTokenizer(br.readLine(), " ");
        numArr = new int[Integer.parseInt(st.nextToken())];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < operatorArr.length; i++) {
            operatorArr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(numArr[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);
    }
    public static void dfs(int num, int idx){
        if(idx==numArr.length){
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for(int i=0; i<operatorArr.length; i++){
            if(operatorArr[i]>0){
                operatorArr[i]--;
                switch (i){
                    case 0: dfs(num+numArr[idx], idx+1); break;
                    case 1: dfs(num-numArr[idx], idx+1); break;
                    case 2: dfs(num*numArr[idx], idx+1); break;
                    case 3: dfs(num/numArr[idx], idx+1); break;
                }
                operatorArr[i]++;
            }
        }
    }

}
