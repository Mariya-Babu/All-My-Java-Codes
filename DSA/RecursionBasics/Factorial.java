import java.util.*;
public class Factorial {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing a Factorail of a given Number ");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        System.out.println("The factorial of the number "+n+" is = " + factorial(n));
    }

    //Function to print factorial using recursion
    public static int factorial(int n){
        if(n <=0){
            return 1;
        }
        return n * factorial(n-1); 
    }
}
