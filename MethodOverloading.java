public class MethodOverloading {
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        MethodOverloading obj2 = new MethodOverloading();
        obj.add(5,7);
        obj2.add(5,6,7);
    }
}
