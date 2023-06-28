import java.util.*;

import javax.swing.plaf.synth.SynthPasswordFieldUI;
class CmdArgs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][] = new int[4][];
        //Input Array
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter "+i+"array size : ");
            int n = sc.nextInt();
            arr[i] = new int[n];
            for(int j=0;j<arr[i].length;j++){
                System.out.print("arr["+i+"]"+"["+j+"] : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        //Print Array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}