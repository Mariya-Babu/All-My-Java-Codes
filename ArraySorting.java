import java.util.*;
class Array{
	Scanner sc=new Scanner(System.in);
	//Function to read the array element's 
	int[] read(int[] a,int n){
		System.out.println("Enter the array element's ");
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt();
			System.out.println();
		}
		return a;
	}
	//Function to display the array element's
	void display(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
class Sort{
	Sort sorting=new Sort();
	int[] mergSort(int[] a,int s,int e){
		int mid = (s+e)/2;
		if(s<e){
			mergSort(a,s,mid);
			mergSort(a,mid+1,e);
			a=sorting.merg(a,s,mid,e);
		}
		return a;
	}
	int[] merg(int[] a,int s,int mid,int e){
		int[] b = new int[e+1];
		int i=s,j=mid+1,k=s;
		while(i<=mid && j<=e){
			if(a[i]<a[j]){
				b[k++] = a[i++];
			}
			else{
				b[k++] = a[j++];
			}
		}
		if(i>mid){
			b[k++] = a[j++];
		}
		else{
			b[k++] = a[i++];
		}
		for(i=s;i<=e;i++){
			a[i] = b[i];
		}
		return a;

	}

}
class ArraySorting{
	public static void main(String args[]){
		//object creation's
		Scanner sc = new Scanner(System.in); 
		Array arr = new Array();
		Sort srt=new Sort();
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int[] a = new int[n];
		a = arr.read(a,n);
		arr.display(a);
		a=srt.mergSort(a,0,n-1);
		arr.display(a);

	}
}
 