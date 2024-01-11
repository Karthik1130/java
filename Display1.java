class Display1 extends Thread {
    int i;
    String s;

    public Display1(String s1, int i1) { // Constructor declaration
        s = s1;
        i = i1;
    }

    public void run() {
        try {
            Thread.sleep(i * 1000);
            System.out.println(s);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
public static void main(String[] args) {
        Thread t1 = new Display1("Good Morning", 1);
        Thread t2 = new Display1("Hello", 2);
        Thread t3 = new Display1("Welcome", 3);

        t1.start();
        t2.start();
        t3.start(); // Use start() to start threads
    }
}