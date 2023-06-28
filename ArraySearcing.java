import java.util.*;
class ArraySearcing
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i,j,n,key;
		System.out.println("Enter the array size :");
		n = sc.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++){
			System.out.println("Enter the array element "+i+" : ");
			a[i] = sc.nextInt();
		}
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the search element..");
		key = sc.nextInt();
		for(i=0;i<n;i++){
			if(a[i]==key){
				System.out.println("Your search key is found at the position "+i);
				break;
			}
		}
	}
}

