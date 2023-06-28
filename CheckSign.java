import java.util.*;
class CheckSign{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to check the number is positive or negative : ");
		int n = sc.nextInt();
		if(n>0){
			System.out.println("The given number is positive ");
		}
		else if(n==0){
			System.out.println("The given number is Zero ");
		}
		else{
			System.out.println("The given number is negative ");
		}
		
	}	
}