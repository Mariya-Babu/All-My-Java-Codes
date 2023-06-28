import java.util.*;
class ErrorHandling{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        int n = 4;
        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        int a,b;
        System.out.println("Enter a value : ");
        a = sc.nextInt();
        System.out.println("Enter b value : ");
        b = sc.nextInt();
        try{
            System.out.println("The Division of the two numbe's is : "+(a/b));
        }
        catch(ArithmeticException ae){
            // ae.printStackTrace();
            // System.out.println("The error was "+ae);
            // System.out.println(ae.getMessage());
            // System.out.println("Division by Zero is not possible ");
            System.out.println("Error");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Error Occured ");
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        try{
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException ab){
            ab.printStackTrace();
            System.out.println("The error was "+ab);
            System.out.println(ab.getMessage());
            System.out.println("Array is out of the range ");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Sorry something is went wrong ");
        }
        finally{
            System.out.println("Programme is finished ");
        }
    }
}