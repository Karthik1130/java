public class Final {
    final int speed = 90;
    void run(){
        speed = 130;
    }
    public static void main(String[] args) {
        Final obj = new Final();
        obj.run();
    }
}
