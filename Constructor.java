public class Constructor {
    String name;
    int rno;
    Constructor(){
        System.out.print("HI ");
        name = "MAX";
        rno = 55;
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        System.out.print(obj.name + "\n" + obj.rno);
    }
}
