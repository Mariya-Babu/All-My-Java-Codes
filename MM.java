import java.util.*;
class MatrixMul{
	static int row1,col1;
	Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		readSize();
		Matrix a=new Matrix(row1,col1);
		a.readEle();
		a.display();
		readSize();
		Matrix b=new Matrix(row1,col1);
		b.readEle();
		b.display();
		Matrix c=new Matrix(a.row,b.col);
	}
	static void readSize(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows of the matrix :");
		row1=sc.nextInt();
		System.out.println("enter the no.of cols of the matrix :");
		col1=sc.nextInt();	
	}
}

class Matrix{
	Scanner sc=new Scanner(System.in);
	int row,col;
	int[][] matrix;
	Matrix(int row,int col){
		this.row=row;
		this.col=col;
		matrix=new int[row][col];
	}
	void readEle(){
		System.out.println("..............."+row);
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print("\nenter the ["+i+"]["+j+"] element :");
				matrix[i][j]=sc.nextInt();
			}
		}
	}

	void display()
	{
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println("");
		}
	}
}