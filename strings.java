import java.util.*;
import java.lang.*;
class StringOperations{
	int strLen(String str){
		char ch[] = str.toCharArray(); 
		int count=0;
		for(char i : ch){
			count++;
		}
		System.out.println("The lenght of the string is "+count);
		return 0;
	}
}
class Strings{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		StringOperations s1=new StringOperations();
		String str=new String();
		System.out.println("Enter a string to findout the length of the string :");
		str = sc.nextLine();
		System.out.println("You entered string is :"+str);
		s1.strLen(str);
		
	}
}