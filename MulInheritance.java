interface Dog {
    void bark();
}
interface Lion {
    void roar();
}
class MInheritance implements Dog,Lion{
    public void bark(){
        System.out.println("Dog is barking");
    }
    public void roar(){
        System.out.println("Lion is Roaring");
    }
}
public class MulInheritance{
public static void main(String[] args) {
        MInheritance obj = new MInheritance();
        obj.bark();
        obj.roar();
    }
}

