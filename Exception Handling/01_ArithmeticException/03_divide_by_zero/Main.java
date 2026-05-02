// Error caught by Exception Class, but ArithmeticException is not required.
// So, It will create ambiguity and error will be caught by Exception Class.
class Main
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 0;
        try{
        int c = a / b;
        System.out.println("c ="+c);
        }
        catch(Exception e){
            System.out.println("Error in Exception");
        }
        catch(ArithmeticException e){
            System.out.println("Error in ArithmeticException");
        }
        
        System.out.println("Program ended successfully");
    }
}