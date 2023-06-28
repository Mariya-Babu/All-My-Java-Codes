import java.util.*;

import javax.naming.spi.ResolveResult;
class Polindrom{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse :");
		int n = sc.nextInt();
		int temp=n,rev=0;
		while(temp!=0){
			rev = rev*10+(temp%10);
			temp = temp/10;
		}
		if(rev==n){
			System.out.println("The given number is polindrome...");
		}
		else{
			System.out.println("The given number is not a polindrome..");
		}
    }
}