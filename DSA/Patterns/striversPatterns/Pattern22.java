// Pattern - 22
import java.util.*;
class Pattern22{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 22");
        System.out.print("Enter m value : ");
        int m = sc.nextInt();
        int n = m+(m-1);


        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<m){
                    if(j<m){
                        if(j<i){
                            System.out.print(" "+(m-j)+" ");
                        }
                        else{
                            System.out.print(" "+(m-i)+" ");
                        }
                    }
                    else{
                        if(i<m-1){
                            if(i+j<n){
                                System.out.print(" "+(m-i)+" ");
                            }
                            else{
                                System.out.print(" "+(m-(n-j-1))+" ");
                            }
                        }
                        else{
                            System.out.print(" "+(m-(n-j-1))+" ");
                        }
                    }
                }
                else{
                    if(j<m){
                        if(i+j<n){
                            System.out.print(" "+(m-j)+" ");
                        }
                        else{
                            System.out.print(" "+(i-(n-m)+1)+" ");
                        }
                    }
                    else{
                        if(j<=i){
                            System.out.print(" "+(i-(n-m)+1)+" ");
                        }
                        else{
                            System.out.print(" "+(m-(n-j)+1)+" ");
                        }
                    }
                }
            }
            System.out.println();
        }

    }
}