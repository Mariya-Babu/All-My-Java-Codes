import java.util.*;
class FS{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c;
        int m;
        System.out.println("Enter the range of the fibonacci series :");   
        m = sc.nextInt();
        for(int i=0;i<m;i++){
            c = a ;
            System.out.print(c+" ");
            a = b;
            b = c + b;
        }
    }
}