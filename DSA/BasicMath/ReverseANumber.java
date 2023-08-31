// Reverse a Given Number
import java.util.*;
class ReverseANumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Reverse a Given Number ");
        System.out.print("Enter a number to reverse : ");
        int n = sc.nextInt();

        int temp = n;
        int rev_num = 0;
        while(temp != 0){
            rev_num = rev_num * 10 + temp % 10;
            System.out.println(rev_num);
            temp = temp / 10;
        }

        System.out.println("Reverse of the given number "+n+" is = "+rev_num);

    }
}