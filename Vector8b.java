import java.util.*;
public class Vector8b {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Amit");
        v.add("Ayush");
        v.add("Arogya");
        v.add("Ayodhya");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }    
}
