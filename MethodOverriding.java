/**
 * MethodOverriding
 */
class Student {
    public void display(){
        System.out.println("I'm a Student");
    }
}
class Teacher extends Student{
    public void display(){
        System.out.println("I'm a Teacher");
    }
}
public class MethodOverriding{
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.display();
    }
}