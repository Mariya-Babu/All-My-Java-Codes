// Count Digit's Of a Number
import java.util.*;
class CountDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count the digit's : ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;

        //Main Logic Start's Here
        while(temp!=0){
            temp = temp / 10;
            count++;
        }
        System.out.println("The number of digits of number "+n+" is = "+count);
        
    }

}