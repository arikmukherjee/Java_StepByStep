// Super Keyword is used to access the constructor of the super class from the sub class
// Cl1->Cl2 : 2 levels of inheritance


class Cl1
{
    int a;
    Cl1(int x){
        a=x;
        System.out.println("Calling super class constructor");
    }
    void op1(){
        System.out.println("a ="+a);
    }
}
class Cl2 extends Cl1
{
    int b;
    Cl2(int x,int y){
        super(x);
        b=y;
        System.out.println("Calling sub class constructor");
    }
    void op2(){
        op1();
        System.out.println("b ="+b);
    }
}
public class Main
{
	public static void main(String[] args) {
		Cl2 ob = new Cl2(20,30);
		ob.op2();
	}
}