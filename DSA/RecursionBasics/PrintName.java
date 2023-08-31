// Print Name Using Recursion 
import java.util.*;
class PrintName{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing the Name N times !");
        System.out.print("Enter you name : ");
        String name = sc.next();
        System.out.print("Enter how many times you want to print the your name : ");
        int n = sc.nextInt();

        printName(name,n);
    }

    public static void printName(String name, int n){
        if(n == 0){
            return;
        }
        System.out.println(name);
        printName(name,n-1);
        return;
    }
};
