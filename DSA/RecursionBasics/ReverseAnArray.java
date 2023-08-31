// Programme to Reverse the given array 
import java.util.*;
public class ReverseAnArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Programme to Reverse the given array ");
        System.out.print("Enter the size of the array : ");

        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int newArr[] = new int[n];
        int nh = n/2;

        System.out.println("Array Before Revering ");
        display(arr);
        System.out.println("Array After Reversing ");
        newArr = arrayReverse(0,nh,n,arr);
        display(newArr);

    }

    // Function to display the Array element's 
    public static void display(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to reverse the array element's
    public static int[] arrayReverse(int i,int nh,int n,int arr[]){
        if(i>=nh){
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        arr = arrayReverse(i+1, nh, n, arr);
        return arr;
    }
}
