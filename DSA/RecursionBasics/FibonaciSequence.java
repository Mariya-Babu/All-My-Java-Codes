import java.util.*;
public class FibonaciSequence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing first N fibonacci Numbers ");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        arr = fibonacci(0,n,arr);
        display(arr);
    }


    // Function to print the fibonacci sequence using recursion 
    public static int[] fibonacci(int i,int n, int[] arr){
        if(i>=n){
            return arr;
        }
        if(i ==0 || i == 1){
            arr[i] = i;
        }
        else{
            arr[i] = arr[i-1] + arr[i-2];
        }
        arr = fibonacci(i+1, n, arr);
        return arr;
    }


    public static void display(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
