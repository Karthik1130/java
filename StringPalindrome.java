import java.util.*;
public class StringPalindrome{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String s = sc.nextLine();
    if(isPalindrome(s))
    System.out.println(s+ " is a Palindrome");
    else
    System.out.println(s+" is not a Palindrome");
    sc.close();
}
public static boolean isPalindrome(String s){
    int low = 0;
    int high = s.length()-1;
    while(low<high){
    if(s.charAt(low)!=s.charAt(high))
    return false;
    low++;
    high--;   
}
return true;
}
}
