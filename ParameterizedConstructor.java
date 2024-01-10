public class ParameterizedConstructor {
    int a;
    String b;
    ParameterizedConstructor(int c,String d){
        a=c;
        b=d;
    }
    public static void main(String[] args) {
        ParameterizedConstructor p1 = new ParameterizedConstructor(45," Hello");
        System.out.print(p1.a+" "+p1.b);
    }
}
