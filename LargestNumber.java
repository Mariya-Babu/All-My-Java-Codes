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



class LargestNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int[] a = new int[n];
		Array arr = new Array();
		a = arr.read(a,n);
		arr.display(a);
        System.out.println("Enter the k value :");
        int k = sc.nextInt();  
	}
    int findLargestElement(int[] a,int k){
        int max = a[0];
        for(int i=0;i<k;i++){
            for(int j=i;j<a.length;j++){
                if(max<a[j]){
                    max = a[j];
                }
            }
        }
    }
}
 