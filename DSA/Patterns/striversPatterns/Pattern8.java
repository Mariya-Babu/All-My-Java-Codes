// Patter - 8

import java.util.*;
class Pattern8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 8");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=0;i<=n;i++){
            //Code for spaces 
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //Code for Star's
            int k = (n - i)* 2 + 1;
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}