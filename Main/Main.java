package Main;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

             while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int i=0;i<n-1;i++){
                if(a[i]!=a[i+1]){
                    temp.add(a[i]);
                }
            }
            temp.add(a[n-1]);
            
            System.out.println(temp.get(temp.size()-1)+temp.get(temp.size()-2));
            
        }
        // Your code goes here
        
    }
}
