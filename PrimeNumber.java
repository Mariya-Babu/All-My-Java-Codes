import java.util.*;
import java.lang.*;

import array.*;
class PrimeNumber{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range :");
		int m = sc.nextInt();
		int count = 0;
		for(int i=2;i<=m;i++){
			count = 0;
			int x = (int)Math.sqrt(i);
			for(int j=2;j<=x;j++){
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count==0){
				System.out.print(i+" ");
			}
		}
		NaturalNumbersSum.playing();
    }
}


