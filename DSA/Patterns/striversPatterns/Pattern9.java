// Pattern - 9

import java.util.*;
class Pattern9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 9");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Code for UpperTriangle
        for(int i=n;i>0;i--){
            for(int j=0;j<i-1;j++){
                System.out.print(" ");
            }
            int k = (n-i)*2+1;
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Code for LowerTriangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            int k = (n-i)*2+1;
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



}


