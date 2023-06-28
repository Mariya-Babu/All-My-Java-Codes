import java.util.*;
class BAO{
    public static void main(String args[]){
        Array a = new Array();
        int n;
        n = a.readSize();
        System.out.println("n = "+n);
    }
}
class Array{
    Scanner sc = new Scanner(System.in);
    int readSize(){
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        return n;
    }
}