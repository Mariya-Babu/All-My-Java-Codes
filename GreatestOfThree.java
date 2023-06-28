import java.util.*;
class GreatestOfThree{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value to check the greatest of 3 number's : ");
		int a = sc.nextInt();
		System.out.println("Enter b value to check the greatest of 3 number's :  ");
		int b = sc.nextInt();
		System.out.println("Enter c value to check the greatest of 3 number's : ");
		int c = sc.nextInt();
		int max;
		max = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("The greatest of three number's is "+max);
	}	
}