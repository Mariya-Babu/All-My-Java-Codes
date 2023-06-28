import java.util.*;
class Pattern15
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x,y;
		for(int i=n;i>0;i--){
			for(int j=n;j>0;j--){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}