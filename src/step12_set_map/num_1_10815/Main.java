package step12_set_map.num_1_10815;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int card = Integer.parseInt(br.readLine());

        int[] cardArr = new int[card];
        StringTokenizer st_Card = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<card; i++){
            cardArr[i] = Integer.parseInt(st_Card.nextToken());
        }
        Arrays.sort(cardArr);

        int compareCard = Integer.parseInt(br.readLine());
        int[] existArr = new int [compareCard];
        StringTokenizer st_Compare = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<compareCard; i++){
            existArr[i] = Integer.parseInt(st_Compare.nextToken());
        }
        int[] sortedExistArr = new int[compareCard];
        System.arraycopy(existArr, 0, sortedExistArr, 0, compareCard);
        Arrays.sort(sortedExistArr);

        HashMap<Integer, Integer> existMap = new HashMap<>();
        for(int x : sortedExistArr){
            existMap.put(x, 0);
        }
        StringBuilder sb = new StringBuilder();
        int temp;
        int idx=0;
        for(int i=0; i<compareCard; i++){
            temp = sortedExistArr[i];
            for(int j=idx; j<card;j++){
                if(cardArr[j] == temp){existMap.put(sortedExistArr[i], 1); idx=j; break;}
                if(cardArr[j] > temp){idx=j; break;}
            }
        }
        for(int key : existArr){
            sb.append(" ").append(existMap.get(key));
        }
        System.out.println(sb.toString().trim());
    }
}