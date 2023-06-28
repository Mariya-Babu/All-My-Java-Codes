import java.util.*;
class Reverse{
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
        System.out.println("printing the element's ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        //Finnding the largest element in the array
        int max = a[0];
        int min = a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }

        }
        System.out.println("The largest element in the array is : "+max);
        System.out.println("The smallest element in the array is : "+min);

    }
}
 
