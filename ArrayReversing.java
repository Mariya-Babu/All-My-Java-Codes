import java.util.*;
class ArrayReversing
{
	public static void main(String args[]){
		int i,j,temp,len;
		System.out.println("Hello User!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++){
			System.out.println("Enter the array element "+i+": ");
			a[i] = sc.nextInt();
		}
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=n-1;i>=0;i--){
			System.out.print(a[i]+" ");
		}
		// Array Reversing start's here
		System.out.println();
		for(i=0;i<n/2;i++){
			temp = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = temp;
		}
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
	}
}
// this is 
// for to learn how to comment 
// all the lines at 
// a constant time