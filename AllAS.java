class Num {
    private int n1 = 1;
    protected int n2 = 2;
    public int n3 = 3;
    int n4 = 4;
    void changen1(){
        System.out.println(n1);
        n1 = 5;
        System.out.println(n1);
    }
}
public class AllAS {
    public static void main(String[] args) {
        Num n = new Num();
        n.changen1();
        System.out.println(n.n2);
        System.out.println(n.n3);
        System.out.println(n.n4);
    }
}