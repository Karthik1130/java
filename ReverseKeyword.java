import java.util.*;
public class ReverseKeyword {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        if(str.equals(sb.toString()))
        System.out.print("Palindrome");
        else
        System.out.print("Not Palindrome");
         sc.close();
    }
}