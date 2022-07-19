package step7_basicMath1.num_8_10757_2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str_A = st.nextToken();
        String str_B = st.nextToken();
        int[] intArr_A = new int[str_A.length()/9+1];
        Arrays.fill(intArr_A, 0);
        int[] intArr_B = new int[str_B.length()/9+1];
        Arrays.fill(intArr_B, 0);

        copynum(intArr_A, str_A);
        copynum(intArr_B, str_B);

        if(intArr_A.length<=intArr_B.length){
            longNumSum(intArr_B, intArr_A);
            int i;
            int k=0;
            if(intArr_B[0] == 0){
                for(k=0;k< intArr_B.length;k++){
                    if(intArr_B[k] != 0){break;}
                }
            }
            StringBuilder sb = new StringBuilder();
            for(i=k;i<intArr_B.length; i++){
                if(i != k) {
                    for (int j = 0; j < 9 - Integer.toString(intArr_B[i]).length(); j++) {
                        sb.append("0");
                    }
                }
                sb.append(intArr_B[i]);
            }
            if(k== intArr_B.length){System.out.println(0);}
            System.out.println(sb.toString());
        } else {
            longNumSum(intArr_A, intArr_B);
            int i;
            int k=0;
            if(intArr_A[0] == 0){
                for(k=0;k< intArr_A.length;k++){
                    if(intArr_A[k] != 0){break;}
                }
            }
            StringBuilder sb = new StringBuilder();
            for(i=k;i<intArr_A.length; i++){
                if(i != k) {
                    for (int j = 0; j < 9 - Integer.toString(intArr_A[i]).length(); j++) {
                        sb.append("0");
                    }
                }
                sb.append(intArr_A[i]);
            }
            if(k== intArr_A.length){System.out.println(0);}
            System.out.println(sb.toString());
        }
    }

    public static void longNumSum(int[] intArrA, int[] intArrB){
        int temp;
        for(int i=1; i<=intArrB.length;i++){
            temp = intArrA[intArrA.length-i]+intArrB[intArrB.length-i];
            if(temp >= 1000000000){
                temp -= 1000000000;
                intArrA[intArrA.length-i-1] += 1;
            }
            intArrA[intArrA.length-i] = temp;
        }
    }
    public static  void copynum(int[] intArr_A, String str){
        int rest = str.length()%9;
        if(rest!=0) {
            intArr_A[0] = Integer.parseInt(str.substring(0, rest));
        }
        for(int i=1; i< intArr_A.length; i++){
            intArr_A[i] = Integer.parseInt(str.substring(rest+(i-1)*9, rest+i*9));
        }
    }
}
