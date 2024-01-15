import java.util.Scanner;
public class NamesInAscOrder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter name "+(i+1)+":");
            names[i] = sc.nextLine();
        }
            String temp;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp = names[j-1];
                    names[j-1] = names[j];
                    names[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Sorted name "+(i+1)+" :"+names[i]);
        }
        sc.close();
    }
}