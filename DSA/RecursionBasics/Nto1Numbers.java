import java.util.*;
public class Nto1Numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing N to 1 Using Recursion ");
        System.out.print("Enter n Value : ");
        int n = sc.nextInt(); 
        System.out.println("Printing N to 1 Using Normail Recursion");
        printNumbers(n);
        System.out.println("Printing N to 1 Using BackTracking ");
        printNumbersBacktracking(1,n);
    }


    public static void printNumbers(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
        return;
    }

    public static void printNumbersBacktracking(int i, int n){
        if(i>n){
            return;
        }
        printNumbersBacktracking(i+1,n);
        System.out.println(i);
        return;
    }


}

