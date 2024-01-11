import java.util.Enumeration;
import java.util.Hashtable;
public class HashT {
    public static void main(String[] args) {
        Hashtable <String,Integer> ht = new Hashtable<>();
        ht.put("A",1);
        ht.put("B",2);
        ht.put("C",3);
        int valueA = ht.get("A");
        System.out.println("Value of A = "+valueA);
        ht.remove("B");
        Enumeration <String> keys = ht.keys();
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.println("Key: "+key+" value: "+ht.get(key));
        }
    }
}
