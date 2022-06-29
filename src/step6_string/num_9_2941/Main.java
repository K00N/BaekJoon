package step6_string.num_9_2941;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String words = br.readLine();
        String CroatiaAlphabet;
        String words2="";
        String words3="";
        int wordsLength = words.length();
        for(int i = 0; i < words.length()-1; i++){
            words2 = Character.toString(words.charAt(i)) + Character.toString(words.charAt(i+1));

            if(i<words.length()-2) {
                words3 = words2 + Character.toString(words.charAt(i + 2));
            } else{ words3 = "";}


            if(words3.equals("dz=")){ wordsLength -= 2; i += 2;}
            else if(words2.equals("c=")){ wordsLength -= 1;}
            else if(words2.equals("c-")){ wordsLength -= 1;}
            else if(words2.equals("d-")){ wordsLength -= 1;}
            else if(words2.equals("lj")){ wordsLength -= 1; }
            else if(words2.equals("nj")){ wordsLength -= 1;}
            else if(words2.equals("s=")){ wordsLength -= 1;}
            else if(words2.equals("z=")){ wordsLength -= 1;}
        }

        bw.write(Integer.toString(wordsLength));
        bw.flush();
        bw.close();
    }
}
