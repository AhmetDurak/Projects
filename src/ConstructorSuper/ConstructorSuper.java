package ConstructorSuper;

public class ConstructorSuper extends B{
    public ConstructorSuper(){
        super();
        System.out.println("Constructor Super");
    }
    public static void main(String[] args) {
        ConstructorSuper constructorSuper = new ConstructorSuper();
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