import java.util.*;
class RevNum{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");
        int n = in.nextInt();
        int rev = 
    }
}
class Reverse{
    int rev(int i){
        int reverse = 0;
        if(i==0){
            return i;
        }
        reverse = i%10;
        rev(i/10);
    }
}