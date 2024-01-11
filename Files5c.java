import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;
public class Files5c {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the filename: ");
    String fileName = sc.nextLine();
    int charCount=0;
    int lineCount=0;
    int wordCount=0;
    try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
        String line;
        while((line = br.readLine())!=null){
            lineCount++;
            StringTokenizer tk = new StringTokenizer(line);
            wordCount = wordCount + tk.countTokens();
            charCount++;
        }
        System.out.println("Number of characters: "+charCount);
        System.out.println("Number of Lines: "+lineCount);
        System.out.println("Number of words: "+wordCount);
    }
    catch(IOException e){
        System.err.println("An error occured while reading the file: "+e.getMessage());
    }
    sc.close();
}
}
