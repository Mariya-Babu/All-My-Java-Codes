// Pattern - 4
import java.util.*;
class Pattrn4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 4");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(i-j+1);
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}