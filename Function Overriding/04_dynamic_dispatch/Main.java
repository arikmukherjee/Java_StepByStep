class Cl1 {
    void f() {
        System.out.println("super class");
    }
}

class Cl2 extends Cl1 {
    void f() {
        System.out.println("sub class");
    }
}

public class P13 {
    public static void main(String[] args) {
        Cl2 ob = new Cl1(); // error // Dynamic Dispatch
        ob.f();
    }
}

/* Dynamic Dispatch is a feature of object-oriented programming that allows a subclass to override a method in its superclass and call the overridden method through a reference of the superclass. */