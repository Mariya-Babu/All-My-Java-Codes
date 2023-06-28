import java.util.*;
class ArrayCopy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        //Readinng of the array element's 
        System.out.println("Enter the array element's : ");
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"] : ");
            a[i] = sc.nextInt();
        }
        //Displaing the array element's 
        System.out.println("\nThe array element's before copy ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        //Coping the array element's into to the another array
        for(int i=0;i<n;i++){
            b[i] = a[i];
        }
        //Displaing the copied array element's 
        System.out.println("\nArray element's after copy in the second array ");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}