import java.io.File;
import java.util.*;
public class Files5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter filename: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if(file.exists())
        System.out.println("File exists");
        if(file.canRead())
        System.out.println("File is readable");
        else
        System.out.println("File is not readable");
        if(file.canWrite())
        System.out.println("File is Writable");
        else
        System.out.println("File is not Writable");
        if(file.isFile())
        System.out.println("File type: Regular File");
        else if(file.isDirectory())
        System.out.println("File type: Directory");
        long fileLength = file.length();
        System.out.println("File Length: "+fileLength+" bytes");
        System.out.println("File doesnot exists");
        sc.close();
    }
}    
