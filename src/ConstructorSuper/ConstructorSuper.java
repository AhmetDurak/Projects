package ConstructorSuper;

public class ConstructorSuper extends B{
    public ConstructorSuper(){
        System.out.println("C ");
    }
    public static void main(String[] args) {
        C oby = new C();
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
class C extends B{
    public C(){
        System.out.println("C ");
    }
}

// All constructors will be called by default because of the feature of the constructor