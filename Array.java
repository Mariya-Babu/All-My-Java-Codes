import java.util.*;
class Array{


	int arr[] = new int[size];//
	Strint str[] = new String[size];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array :");
		n = sc.nextInt();
		int arr[] = new int[n];
		while(1==1){
			int choice;
			System.out.println("1.read \n2.insert \n3.delete \n4.exit");
			System.out.println("Enter you choice :");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					read(n);
					break;
				case 2:		
					insert();
					break;
				case 3:
					delete();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Invalid choice");

			}

			 
		}	
		
	}
	 static int read(int n){
		int num,i=1,j;
		while(i==1){
			System.out.println("Enter how many element's do you want to inset :");
			num = sc.nextInt();
			if(num>=0 && num<=n){
				i=0;
			}else{
				System.out.println("Invalid position please enter the position again... ");
			}
		}
		for(j=0;j<num;j++){
			System.out.println("Enter the element"+j+" : ");
					

		}
		
	}
	static int insert(){
		int position;
		System.out.println("Inert function is not working please select the another option given below ....");
		return 0;
	}
	static int delete(){
		int position;
		System.out.println("Delete function is not working please select the another option given below ....");
		return 0;
	}
	
}
