//BEFORE OVERRIDING
class Cl1
{
    void f(){
        System.out.println("super class");
    }
}
class Cl2 extends Cl1
{
    void f(){
        System.out.println("sub class");
    }
}
public class Main
{
	public static void main(String[] args) {
		Cl1 ob = new Cl1();
		ob.f();
		
	}
}