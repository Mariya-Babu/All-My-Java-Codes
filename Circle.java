import java.util.*;
class Circle{
	float radius;
	static float PI = 3.14f;
	Circle(float x){
		radius = x;
	}
	void area(){
		float area = PI*radius*radius;
		System.out.println("the area of the circle with radius "+radius+" is :"+area);
	}
	void perimeter(){
		float perimeter = 2*PI*radius;
		System.out.println("the perimeter of the circle with radius "+radius+" is :"+perimeter);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle :");
		int radius = sc.nextInt();
		Circle c1 = new Circle(radius);
		c1.area();
		c1.perimeter();
		Circle c2=new Circle(5);
		c2.area();
		c2.perimeter();

	}
	
}