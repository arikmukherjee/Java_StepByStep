interface Cl1
{
    void f();
}
class Cl2 implements Cl1
{
    public void f()
    {
        System.out.println("sub class");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Cl2 ob = new Cl2();
        ob.f();
    }
}