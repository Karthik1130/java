public class ThisKeyword {
    int rno;
    String sname;
    ThisKeyword(int rno,String sname){
        this.rno = rno;
        this.sname = sname;
    }
    void display(){
        System.out.println(sname + " "+rno);
    }
    public static void main(String[] args) {
        ThisKeyword tk1 = new ThisKeyword(123, "Ajay");
        ThisKeyword tk2 = new ThisKeyword(456, "Ravi");
        tk1.display();
        tk2.display();
    }
}
