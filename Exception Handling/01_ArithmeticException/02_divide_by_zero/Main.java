// Use two catch blocks : Exception and ArithmeticException

// Error caught by ArithmeticException
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
        catch(ArithmeticException e){
            System.out.println("Error in ArithmeticException");
        }
        catch(Exception e){
            System.out.println("Error in Exception");
        }
        
        System.out.println("Program ended successfully");
    }
}