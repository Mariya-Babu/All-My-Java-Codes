import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the factorial of the number :");
        int n = sc.nextInt();
        int fact=factorial(n);
        System.out.println("The factorial of "+n+" is "+fact);
    }
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}