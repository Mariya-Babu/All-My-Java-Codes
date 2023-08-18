// Pattern - 7

import java.util.*;
class Pattern7{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Pattern - 7");
        System.out.print("Enter n value : ");
        int n = in.nextInt();

        //Main Logic Start's Here
        for(int i=n;i>0;i--){
            //Printing spaces
            for(int j=0;j<i-1;j++){
                System.out.print(" ");
            }
            int  k = (n-i)*2 + 1;

            //Printing Stars
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}