import java.util.*;
public class ArrayLst {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ravi");
        list.add("ajay");
        list.add("vijay");
        list.add("ramu");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
