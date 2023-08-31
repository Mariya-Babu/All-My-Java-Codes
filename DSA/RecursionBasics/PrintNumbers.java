// Print first N Natural Numbers using Recursion 
import java.util.*;
class PrintNumbers{
    // Main Function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing first N Natural Numbers ");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        System.out.println("Print 1 to N numbers using normal recursion ");
        printNumbers(1,n);
        System.out.println("Print 1 to N numbers using Backtracking ");
        printNumbersBacktracking(n);

    }

    // Function to print 1 to N numbers using normal recursion
    public static void printNumbers(int x, int n){
        if(x == n){
            System.out.println(x);
            return;
        }
        System.out.println(x);
        printNumbers(x+1,n);
        return;

    }

    // Function to print  1 to N Numbers Using Backtracking
    public static void printNumbersBacktracking(int n){
        if(1 > n){
            return;
        }
        printNumbersBacktracking(n-1);
        System.out.println(n);
        return;
    }
}