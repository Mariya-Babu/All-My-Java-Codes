import java.util.*;
//This is function to perform the array operation's
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
//This is programme to perform the matrix operation's

class Matrix{
    Scanner sc = new Scanner(System.in);
    //Function to read the Matrix
    int[][] read(int[][] a,int r,int c){  
        System.out.println("Enter the elemeent's of the array ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("a["+i+"]["+j+"] : ");
                a[i][j] = sc.nextInt();
                System.out.println();
            }
        }
        return a;
    }
    //Function to display the Matrix
    void display(int[][] a,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Function to Transpose the matrix 
    void transpose(int a[][],int r,int c){
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
//This is the class to perform the Transpose of an array
class Transpose{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Matrix m = new Matrix();
        int r1,c1;
        int r2,c2;
        //Taking First array input from the array
        System.out.println("Enter the no.of row's of the First array :");
        r1 = sc.nextInt();
        System.out.println("Enter the no.of col of the First array :");
        c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter the first array element's ");
        arr1 = m.read(arr1,r1,c1);
        m.display(arr1,r1,c1);
        System.out.println();
        m.transpose(arr1,r1,c1);
        Second array row and col input and diclaration
        System.out.println("Enter the no.of row's of the Second array :");
        r2 = sc.nextInt();
        System.out.println("Enter the no.of col of the Second array :");
        c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter the second array element's ");
        arr2 = m.read(arr2,r2,c2);
        m.display(arr2,r2,c2);

    }

}
