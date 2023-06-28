import java.util.*;
class MatrixEx{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the matrix : ");
		int size = sc.nextInt();
		int[][] A=new int[size][size];
		int[][] B=new int[size][size];
		int[][] C=new int[size][size];

		//MatOp mo=new MatOp();
		//scanning the matrix element's
		System.out.println("Enter the first matrix element's ");	
		readEle(A,size,size);
		printMatrix(A,size,size);
		System.out.println("Enter the second matrix element's ");
		readEle(B,size,size);
		printMatrix(B,size,size);
        
        //multipling the two matrix using the for loops
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                for(int k=0;k<size;k++){
                    C[i][j] +=A[i][k]*B[k][j];
                }
            }
        }
		System.out.println("The matrix multiplication of two matrices is ");
		printMatrix(C,size,size);
	}
	//To input the matrix element's 
	static int[][] readEle(int[][] a,int row,int col){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.println("A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}
	//To print the matrix element's 
	static int[][] printMatrix(int[][] a,int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		return a;
	}
}


/* 
import java.util.*;
class MatrixMul{
	static int row1,col1;
	Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		// readSize();
		// Matrix A=new Matrix(row1,col1);
		// A.readEle();
		// A.display();
		// readSize();
		// Matrix B=new Matrix(row1,col1);
		// B.readEle();
		// B.display();
		// //Matrix c=new Matrix(a.row,b.col);
		
		System.out.println("Enter the size of the matrix : ");
		int size = sc.nextInt();
		int[][] A=new int[size][size];
		int[][] B=new int[size][size];
		int[][] C=new int[size][size];

		MatOp mo=new MatOp();
		//scanning the matrix element's
		System.out.println("Enter the first matrix element's ");	
		readEle(A,size,size);
		printMatrix(A,size,size);
		System.out.println("Enter the second matrix element's ");
		readEle(B,size,size);
		printMatrix(B,size,size);
		System.out.println("The matrix multiplication of two matrices is ");
		C=mo.strAlgo(A,B,size,size);
		printMatrix(C,size,size);
	}
	//To input the matrix element's 
	static int[][] readEle(int[][] a,int row,int col){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.println("M["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}
	//To print the matrix element's 
	static int[][] printMatrix(int[][] a,int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		return a;
	}
	static void readSize(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows of the matrix :");
		row1=sc.nextInt();
		System.out.println("enter the no.of cols of the matrix :");
		col1=sc.nextInt();	
		return;
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
class MatOp{
	//Matrix Addition
	static int[][] add(int[][] a,int[][] b){
		int col = a[0].length;
		int row = a.length;
		int[][] c=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		return c;
	}
	//Matrix Subtraction
	static int[][] sub(int[][] a,int[][] b){
		int col = a[0].length;
		int row = a.length;
		int[][] c=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				c[i][j] = a[i][j]-b[i][j];
			}
		}
		return c;
	}
	//Stressens Algo
	int[][] strAlgo(int[][] A,int[][] B, int row,int col){
		MatOp mo=new MatOp();
		if(row<=1){
			int[][] c = new int[1][1];
			c[0][0] = A[0][0]*B[0][0];
			return c;
			
		}
		else{
			int size = row/2;
			//submatrices
			int[][] a=new int[size][size];
			int[][] b=new int[size][size];
			int[][] c=new int[size][size];
			int[][] d=new int[size][size];
			int[][] e=new int[size][size];
			int[][] f=new int[size][size];
			int[][] g=new int[size][size];
			int[][] h=new int[size][size];

			//coping orginal array element's into the sub array's
			for(int i=0;i<size;i++){
				for(int j=0;j<size;j++){
					a[i][j] = A[i][j];
					b[i][j] = A[i][j+size];
					c[i][j] = A[i+size][j];
					d[i][j] = A[i+size][j+size];
					e[i][j] = B[i][j];
					f[i][j] = B[i][j+size];
					g[i][j] = B[i+size][j];
					h[i][j] = B[i+size][j+size];
				}
			}
			int[][] temp1=new int[size][size];
			int[][] temp2=new int[size][size];

			//resultent matrices
			int[][] p1=new int[size][size];
			int[][] p2=new int[size][size];
			int[][] p3=new int[size][size];
			int[][] p4=new int[size][size];
			int[][] p5=new int[size][size];
			int[][] p6=new int[size][size];
			int[][] p7=new int[size][size];
			
			//using the stressens matrices multiplication formulas
			temp1 = sub(f,g);
			p1 = mo.strAlgo(a,temp1,size,size);

			temp1 = add(a,b);
			p2 = mo.strAlgo(temp1,h,size,size);

			temp1 = add(c,d);
			p3 = mo.strAlgo(temp1,e,size,size);

			temp1 = sub(g,e);
			p4 = mo.strAlgo(d,temp1,size,size);

			temp1 = add(a,d);
			temp2 = add(e,h);
			p5 = mo.strAlgo(temp1,temp2,size,size);

			temp1 = sub(b,d);
			temp2 = add(g,h);
			p6 = mo.strAlgo(temp1,temp2,size,size);

			temp1 = sub(a,e);
			temp2 = add(e,f);
			p7 = mo.strAlgo(temp1,temp2,size,size);

			//combaining the 7 matrices

			int[][] c11 = new int[size][size];
			int[][] c12 = new int[size][size];
			int[][] c21 = new int[size][size];
			int[][] c22 = new int[size][size];
			
			temp1 = add(p5,p4);
			temp1 = sub(temp1,p2);
			c11 = add(temp1,p6);
			c12 = add(p1,p2);
			c21 = add(p3,p4);
			temp1 = add(p1,p5);
			temp1 = sub(temp1,p3);
			c22 = sub(temp1,p7);

			//coping all the element's into the resultent matrices
			int[][] result = new int[row][col];
			for(int i=0;i<size;i++){
				for(int j=0;j<size;j++){
					result[i][j] = c11[i][j];
					result[i][j+size] = c12[i][j];
					result[i+size][j] = c21[i][j];
					result[i+size][j+size] = c22[i][j];
				}
			}
			return result;
		}
	}
}


// //using the stressens matrices multiplication formulas
// 			temp1 = sub(f,g);
// 			p1 = mo.strAlgo(a,temp1,size,size);

// 			temp1 = add(a,b);
// 			p2 = mo.strAlgo(temp1,h,size,size);

// 			temp1 = add(c,d);
// 			p3 = mo.strAlgo(temp1,e,size,size);

// 			temp1 = sub(g,e);
// 			p4 = mo.strAlgo(d,temp1,size,size);

// 			temp1 = add(a,d);
// 			temp2 = add(e,h);
// 			p5 = mo.strAlgo(temp1,temp2,size,size);

// 			temp1 = sub(b,d);
// 			temp2 = add(g,h);
// 			p6 = mo.strAlgo(temp1,temp2,size,size);

// 			temp1 = sub(a,e);
// 			temp2 = add(e,f);
// 			p7 = mo.strAlgo(temp1,temp2,size,size);

// 			//combaining the 7 matrices

// 			int[][] c11 = new int[size][size];
// 			int[][] c12 = new int[size][size];
// 			int[][] c21 = new int[size][size];
// 			int[][] c22 = new int[size][size];
			
// 			temp1 = add(p5,p4);
// 			temp1 = sub(temp1,p2);
// 			c11 = add(temp1,p6);
// 			c12 = add(p1,p2);
// 			c21 = add(p3,p4);
// 			temp1 = add(p1,p5);
// 			temp1 = sub(temp1,p3);
// 			c22 = sub(temp1,p7);


*/