import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Files5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String fileName = sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            int lineNumber = 1;
            while((line = br.readLine())!=null){
                System.out.println("Line"+lineNumber+":"+line);
                lineNumber++;
            }
        }
        catch(IOException e){
            System.err.println("An error Occurred while reading the message: "+e.getMessage());
        }
    }
}
