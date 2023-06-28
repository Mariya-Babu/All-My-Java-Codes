import java.util.*;
class Amstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the number is amstrong or not :");
        int m = sc.nextInt();
        int temp=m,count=0,sum=0;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        temp  = m;
        while(temp!=0){
            int x,y=1;
            x = temp%10;
            for(int i=1;i<=count;i++){
                y = y*x;
            }
            sum +=y;
            temp = temp/10;
        }
        if(sum==m){
            System.out.println("The entered number is an amstrong number ");
        }
        else{
            System.out.println("The entered number is not an amstrong number ");
        }
    }
    
}