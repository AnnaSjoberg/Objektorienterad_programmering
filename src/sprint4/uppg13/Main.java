package sprint4.uppg13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public Main() throws IOException {
        String currentLine;
        int words = 0;
        int[] wordLengths = new int[8];
        int tooLong = 0;
        try {
            URL url = new URL(" https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");

            try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));) {
                while ((currentLine = br.readLine()) != null) {
                    int length = currentLine.length();
                    if (length > wordLengths.length) {
                        tooLong++;
                    } else {
                        wordLengths[length-1]++;
                    }
                    words++;
                }
            }
            System.out.println("finished reading, great content!");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < wordLengths.length; i++) {
            if (wordLengths[i] > 0) {
                System.out.println("Number of words with " + (i+1) + " characters: " + wordLengths[i]);
            }
        }
        if (tooLong>0){
            System.out.println("Number of words that were longer than expected: " + tooLong);
        }
        System.out.println("Total number of words: " + words);
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
    }
}
