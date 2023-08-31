// Find GCD of two numbers
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find GCD of two numbers!");
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter second Number : ");
        int b = sc.nextInt();
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }

        int x = a;
        int y = b;

        while(y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }

        System.out.println("GCD of "+a+" and "+b+" is = "+x);



    }
}
