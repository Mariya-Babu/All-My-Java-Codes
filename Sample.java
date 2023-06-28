class Sample
{
	public static void main(String args[]){ 
		int x = 20; // Know varable / class variable
		{
			int y = 30;
			System.out.println("x + y value is "+(x+y));
		}
		//y = 50; //Unknow variable 
		x = 100;
	}
}
