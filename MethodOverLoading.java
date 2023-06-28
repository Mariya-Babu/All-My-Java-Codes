import java.util.*;
import java.lang.*;
class MethodOverLoading{
    void sum(int a ,string b){
        System.out.println("This is void return type function");
    }
    int sum(int a,int b){
        System.out.println("This is int return type function ");
        System.out.println("The sum of the two number's is : "+(a+b));
        return (a+b);
    }
    float sum(int a,float b){
        System.out.println("This is float return type function ");
        System.out.println("The sum of the two number's is : "+(a+b));
        return ((a+b));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        MethodOverLoading mol = new MethodOverLoading();
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Enter b value : ");
        int b = sc.nextInt();
        //float x = 
        mol.sum(a,b);
       // System.out.println("The function is successful and it return the value : "+x);
    }
}