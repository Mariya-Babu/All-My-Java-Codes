import java.util.*;

class Strings{
	int countChar(String ch[]){
		int count = 0;
		for(int i=0;ch[i]!=null;i++){
			count++;
		}
		System.out.println("The no.of character's are : "+count);
		return count;
	}
}
class StringOperations{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Strings s = new Strings();
		System.out.println("Enter a string to print the no.of Character's of the string ");
		String str = sc.nextLine();
		s.countChar(str);
		
	}
}
                             