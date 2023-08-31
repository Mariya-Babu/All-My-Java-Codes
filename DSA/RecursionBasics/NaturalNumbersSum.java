// Programme to print Sum of N Naturals Using (Recursion & Loops )
import java.util.*;
public class NaturalNumbersSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of N Natural Numbers Using Loops and Recursion ");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        System.out.println("Sum of Natural Numbers using loops : " + sumOfNaturalNumbersUsingLoops(n));
        System.out.println("Sum of Natural Numbers using recursion : "+ sumOfNaturalNumbersUsingRecursion(n));
        System.out.println("Sum of Natural Numbers using backtracking : "+ sumOfNaturalNumbersUsingBacktracking(0, n));

    }

    // Function to print sum of natural numbers using loops
    public static int sumOfNaturalNumbersUsingLoops(int n){
        int result = 0;
        for(int i=0;i<=n;i++){
            result += i;
        }
        return result;
    }

    // Function to print sum of natural numbers using recursion
    public static int  sumOfNaturalNumbersUsingRecursion(int n){
        if(n<=0){
            return 0;
        }
        return n + sumOfNaturalNumbersUsingRecursion(n-1);
    }

    //Function to print sum of natural numbers using backtracking
    public static int sumOfNaturalNumbersUsingBacktracking(int i, int n){
        if(i>=n){
            return n;
        }

        return i + sumOfNaturalNumbersUsingBacktracking(i+1,n);
    }



}
