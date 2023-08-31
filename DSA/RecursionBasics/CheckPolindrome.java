// Programme to check whether the given  string is polindrome or not 
import java.util.Scanner;
public class CheckPolindrome {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Programme to check the given string is polindrome or not using Recursion ");
            System.out.println("Enter a string : ");
            String str = sc.nextLine();

            boolean bool = checkPolindrome(0,str.length()/2,str.length(),str);
            if(bool){
                System.out.println("Given String is Polindrome ");
            }
            else{
                System.out.println("Given String is not a Polindrome ");
            }

        }


        //Function to check given string is polidrome of not using recursion
        public static boolean checkPolindrome(int i,int nh, int n, String str){  //  nh = n/2
            boolean bool;
            if(i>=nh){
                bool = true;
                return bool;
            }
            if(str.charAt(i) == str.charAt(n-i-1)){
                bool = checkPolindrome(i+1, nh, n, str);
            }
            else{
                bool = false;
                return bool;
            }
            return bool;
        }
}
