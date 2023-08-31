// Print all Divisors of a given Number
import java.util.*;
class Divisors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print all Divisors of a Given Number ");
        System.out.print("Enter a number to print all the divisors of the number : ");
        int n = sc.nextInt();

        System.out.print(1+" ");
        for(int i=2;i<=Math.ceil(n/2);i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
        System.out.print(n);
    }
}