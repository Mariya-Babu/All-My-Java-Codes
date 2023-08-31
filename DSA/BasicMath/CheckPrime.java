// Check Given Number is Prime Number or Not
import java.util.*;
class CheckPrime{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Checking Given Number is Prime or Not ");
        System.out.print("Enter a number to check whether the given number is prime or not : ");
        int n = sc.nextInt();
        int flag = 0;

        for(int i=2;i<=Math.ceil(n/2);i++){
            if(n%i == 0){
                flag++;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Given Number is Prime Number!");
        }
        else{
            System.out.println("Given Number is Not a Prime Number!");
        }
    }
}