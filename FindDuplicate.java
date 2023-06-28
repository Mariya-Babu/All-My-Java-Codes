import java.util.*;
class FindDuplicate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        int count=0;
        //Taking array elemnt's from the user 
        System.out.println("Enter the array element's :");
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"] : ");
            a[i] = sc.nextInt();
        }
        //Displaing the array element's 
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        //Finding the Duplicate element's in the given array 
        System.out.println("Duplicate element's in array are : ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]+" ");
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("array has no duplicat's ");
        }
    }
}