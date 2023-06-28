class Outer{
	static class Inner{
		void innerMethod(){
			System.out.println("Inner Class");
		}
	}
	public static void main(String args[]){
		Inner i=new Inner();
			i.innerMethod();
	}
}