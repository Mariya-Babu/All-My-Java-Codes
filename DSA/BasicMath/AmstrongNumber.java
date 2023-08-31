// Print frist N Amstrong Numbers
import java.util.*;
class AmstrongNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding  Amstrong Numbers between (1,N)");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isAmstrongNumber(i)){
                System.out.print(i+" ");
                // System.out.println("Result = "+i);
            }
        }
    }
    

    //Function to finding the given number is Amstrong Number or Not
    public static boolean isAmstrongNumber(int n){
        int Digits = countDigits(n);
        // System.out.println(" The digit's of the number "+n+" = "+Digits);
        int temp = n;
        int result = 0;
        while(temp != 0){
            int rem = temp % 10;
            result = result + pow(rem,Digits);
            temp = temp / 10;
        }
        if(n == result){
            // System.out.println("result = "+result);
            return true;
        }
        else{
            return false;
        }
    }

    //Function to Count the Digits of the given Number
    public static int countDigits(int n){
        int temp = n;
        int count = 0;
        while(temp != 0){
            temp = temp / 10;
            count++;
        }
        return count;
    }

    //Function to find the x to the power y 
    public static int pow(int base, int power){
        if(power <= 0){
            return 1;
        }
        return base * pow(base,power-1);
    }
}