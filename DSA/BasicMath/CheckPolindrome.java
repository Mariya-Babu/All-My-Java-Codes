// Check Given Number is Polindrome or Not
import java.util.*;
class CheckPolindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Checking the Given Number is Polindrome or Not");
        System.out.print("Enter a number to check whether the given number is polindrome or not : " );
        int n = sc.nextInt();
        int temp = n;
        int rev_num = 0;

        while(temp != 0){
            rev_num = rev_num * 10 + temp % 10;
            temp = temp / 10;
        }

        if(rev_num == n){
            System.out.println("Given number is Polindrome!");
        }
        else{
            System.out.println("Given number is not a Polindrome!");
        }
    }
}