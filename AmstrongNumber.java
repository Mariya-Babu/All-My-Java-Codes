import java.util.*;
class Amstrong{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the range : ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++){
			int temp =i;
			int count=0,sum=0,m=1;
			while(temp!=0){
				count++;
				temp = temp/10;
			}
			temp = i;
			while(temp!=0){
				int q=1;
				m =temp%10; 
				temp = temp/10;
				for(int j=1;j<=count;j++){
					q = q*m;
				}
				sum +=q;
			}
			if(sum==i){
				System.out.print(i+" ");
			}
		}
    }
}