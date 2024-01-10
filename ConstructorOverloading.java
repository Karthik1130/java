public class ConstructorOverloading {
    int rno;
    String sname;
    int age;
    public ConstructorOverloading(int x,String y){
        rno = x;
        sname = y;
    }
    public ConstructorOverloading(int x,String y,int z){
        rno = x;
        sname = y;
        age = z;
    }
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading(123,"Jay");
        ConstructorOverloading obj2 = new ConstructorOverloading(456,"Ajay",23 );
        System.out.println(obj1.sname+" "+obj1.rno);
        System.out.println(obj2.sname+" "+obj2.rno+" "+obj2.age);
    }
}
