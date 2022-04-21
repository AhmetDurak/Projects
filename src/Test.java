

public class Test  extends B{
    public Test(){
        System.out.println("C ");
    }
    public static void main(String[] args) {
        B oby = new B();
    }
}

class A{
    public A(){
        System.out.println("A ");
    }
}
class B extends A{
    public B(){
        System.out.println("B ");
    }
}