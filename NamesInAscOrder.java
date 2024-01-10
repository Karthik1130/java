import java.util.Scanner; 
class NamesInAscOrder 
{ 
public static void main(String args[]) 
{ 
String temp; 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter the value of n: "); 
int n=sc.nextInt(); 
sc.nextLine();
String names[] = new String[n];
System.out.println("Enter names: "); 
for(int i=0; i<n; i++) 
{
System.out.print("Enter name [ " + (i+1) +" ]:"); 
names[i] = sc.nextLine();
for(int k=0; k<n; k++) 
{ 
for(int j=1; j<n; j++) 
{ 
 if(names[j].compareTo(names[j-1])>0) 
 { 
 temp=names[j-1]; 
 names[j-1]=names[j]; 
 names[j]=temp; 
 } 
} 
} 
System.out.println("\nSorted names are in Ascending Order: "); 
for(int k=0;k<n;k++) { 
System.out.println(names[k]); 
} 
}
sc.close();
}
}