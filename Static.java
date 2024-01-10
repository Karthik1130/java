public class Static {
    int rno;
    String sname;
    static String college = "GRIET";
    static void change(){
        college = "CBIT";
    }
    Static(int r,String n){
        rno = r;
        sname = n;
    }
    void display(){
        System.out.println(rno+" "+sname+" "+college);
    }
    public static void main(String[] args) {
        Static.change();
        Static s1 = new Static(123,"Ajay");
        Static s2 = new Static(456, "Abhinav");
        s1.display();
        s2.display();
    }
}
