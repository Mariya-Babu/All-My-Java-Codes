import java.util.*;
class Array{
    Scanner sc = new Scanner(System.in);
    //Function to read
    int[] read(int[] a,int n){  
        System.out.println("Enter the array element's ");
        for(int i=0;i<n;i++){
            System.out.print("a["+"] : ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        return;
    }
}
class Share{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Array arr = new Array();
        //ShareMarket sm = new ShareMarket();
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int[] a = new int[n];
        a =  arr.read(a,n);
        arr.display(a);
        int Profit = ShareMarket.profit(a);
        System.out.println("The profit in the share's is :"+Profit);
    }
}
class ShareMarket{
    ShareMarket sm = new ShareMarket();
    static int minIndex(int a[]){
        int min_index = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]<a[min_index]){
                min_index = i ;
            }
        }
        return min_index;
    }
    static int maxIndex(int a[],int min_index){
        //int min_index = sm.minIndex(a);
        int max_index = 0;
        for(int i=min_index;i<a.length;i++){
            if(a[i]>a[max_index]){
                max_index = i;
            }
        }
        return max_index;
    }
    static int profit(int a[]){
        int min_index = minIndex(a);
        int max_index = maxIndex(a,min_index);
        System.out.println("You can buy the share's at day "+(min_index+1));
        System.out.println("You can sell the share's at day "+(max_index+1));
        return a[max_index] - a[min_index];
    }
}