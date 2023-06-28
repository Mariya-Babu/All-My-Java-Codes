import java.util.*;
class CallByValue
{
	public static void main(String args[]){
		Scanner sc = new Scanner();
		CallByValue d = new CallByValue();
		int x;
		System.out.println("Enter the x value :");
		x = sc.nextInt();
		d.display(10);
	}
	void display(int x){
		System.out.println("The call by value is "+x);
	}

}