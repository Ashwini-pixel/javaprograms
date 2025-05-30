// widening:Widening casting is done automatically when passing a smaller size type to a larger size type:
public class casting {
    public static void main(String[] args) {
        int myInt = 20;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);
    System.out.println(myDouble);


    
// narrow type:Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
// public class casting {

    double myDouble_1 = 9.78d;
    int myInt_1 = (int) myDouble_1; // Explicit casting: double to int

    System.out.println(myDouble_1);
    System.out.println(myInt_1);
  
    }
    
}
