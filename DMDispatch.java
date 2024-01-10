class Animal{
    void sound(){
        System.out.println("Some sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}
public class DMDispatch {
    public static void main(String[] args) {
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();
        obj1.sound();
        obj2.sound();
    }
}
