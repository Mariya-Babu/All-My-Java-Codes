import java.util.*;
class ElementSum{
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
        //Calculating the sum of the array element's 
        int sum =0 ;
        for(int i=0;i<a.length;i++){
            sum +=a[i];
        }
        System.out.println("The of the array element's is : "+sum);
    }
}
