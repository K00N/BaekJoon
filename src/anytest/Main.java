package anytest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        int a=24913;
        int t=0;
        while(t<50) {
            if (a % 2 == 0) {
                System.out.println("true");
            } else if (a % 2 != 0) {
                System.out.println("false");
            }
            t++;
        }
    }


}






















