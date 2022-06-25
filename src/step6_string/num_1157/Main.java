package step6_string.num_1157;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        int temp;
        for(int i = 0; i < words.length(); i++) {
            temp = (int) words.charAt(i)-97;
            if (arr[temp] == -1)
                arr[temp] = i;
        }
        for(int j = 0; j < 26; j++)
            System.out.print(arr[j]+" ");
    }
}
