class Super {
    String colour = "White";
    void color(){
        System.out.println(colour);
    }
}
class Super2 extends Super{
    String colour = "Black";
    void color(){
        super.color();
        System.out.println(colour);
    }
}
public class SuperKeyword{
    public static void main(String[] args) {
        Super2 obj = new Super2();
        obj.color();
    }
}
