// Super Keyword is used to call the method of the super class from the sub class
// Cl1->Cl2 : 2 levels of inheritance

class Cl1
{
    void f1(){
        System.out.println("super class");
    }
}
class Cl2 extends Cl1
{
    void f2(){
        super.f1();
        System.out.println("sub class");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Cl2 ob = new Cl2();
        ob.f2();
    }
}