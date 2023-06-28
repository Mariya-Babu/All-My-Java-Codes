//Java programme to  find largest number among the given 3 number's 
import java.util.*;
class LargeNumber{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Compare cmp = new Compare();
        System.out.println("Programme to print the largest of all the given three number's ");
        System.out.println("Enter a value : ");
        int a = in.nextInt();
        System.out.println("Enter b value : ");
        int b = in.nextInt();
        System.out.println("Enter c value : ");
        int c = in.nextInt();
        int max = cmp.compare_nums(a,b,c);
    }
}
class Compare{
    int compare_nums(int a,int b,int c){
        if(a>b){
            if(a>c){
                System.out.println("value of a "+a+" is the greast among the 3");
                return a;
            }
            else{
                System.out.println("value of c "+c+" is the greast among the 3");
                return c;
            }
        }
        else{
            if(b>c){
                System.out.println("value of  b "+b+" is the greast among the 3");
                return b;
            }
            else{
                System.out.println("value of c "+c+" is the greast among the 3");
                return c;
            }
        }
    }
}
