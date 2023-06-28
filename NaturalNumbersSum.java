import java.util.*;
package array;
public class NaturalNumbersSum{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a naturla number to find the sum of Natural Number's upto n :");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<=n;i++){
			sum +=i;
		}
		System.out.println("The sum of the natural number's is : "+sum);
	}

	public static int playing(){
		System.out.println('Playing....');
		return 0;
	}

	public int add(a,b){
		System.out.println(a+b);
		return a+b;
	}

}


