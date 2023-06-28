import java.util.*;
class AverageMarks
{
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name:");
        String name  = sc.next();
        System.out.println("Eneter the 3 subject marks");
        char ch = getCharFromString(name,0);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int avg;
        avg = (m1+m2+m3)/3;
        System.out.println(avg);d cd 
        
        
    }
}