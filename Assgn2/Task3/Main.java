
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Read the "input.txt" file
        String filePath = "input.txt";
        // Count the number of lines, words, and characters
        int lineCount = 0, wordCount = 0, charCount = 0;
        String line;
        String[] words;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            
            while ((line = reader.readLine()) != null) {
                lineCount++;
                words = line.split("\\s+");
                wordCount += words.length;
                charCount += line.length();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Display the counts on the console
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);


    }
}