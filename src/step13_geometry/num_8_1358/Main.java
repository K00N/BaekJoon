package step13_geometry.num_8_1358;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int width = Integer.parseInt(st.nextToken());
        double height = Double.parseDouble(st.nextToken());
        int rink_x = Integer.parseInt(st.nextToken());
        int rink_y = Integer.parseInt(st.nextToken());
        int playerNum = Integer.parseInt(st.nextToken());
        double radius = height/2;
        int player_x=0, player_y=0;
        int count=0;
        double distance=0;
        for(int i=0; i<playerNum; i++){
            st = new StringTokenizer(br.readLine(), " ");
            player_x = Integer.parseInt(st.nextToken());
            player_y = Integer.parseInt(st.nextToken());
            if( (rink_x<=player_x) && (player_x<=(rink_x+width)) ){
                if( (rink_y<=player_y) && (player_y<=(rink_y+height)) ) {count++;}
            } else if(player_x<rink_x) {
                distance = getDistance(rink_x, rink_y+radius, player_x, player_y);
                if(distance <= radius){ count++; }
            } else if (player_x>rink_x+width){
                distance = getDistance(rink_x+width, rink_y+radius, player_x, player_y);
                if(distance <= radius){ count++; }
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
    public static double getDistance(int a_x, double a_y, int b_x, int b_y){
        return Math.sqrt( Math.pow(Math.abs(a_x-b_x),2) + Math.pow(Math.abs(a_y - b_y), 2) );
    }
}
