package p01;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle(10);
		
	Rectangle rec = new Rectangle(100,200);

	Triangle tri = new Triangle(100,200);

	twoDImenShape[] arr = {c,rec,tri};
	
	for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i].getArea());
		
	}
	
	Cube cu = new Cube(20,30,50); 

	
	Sphere sp = new Sphere(50);

	
	Cylinder der = new Cylinder(30,50);


	ThreeDimenShape[] arr2 = {cu,sp,der};
	for( int i=1; i<arr.length; i++)
	{
		System.out.println(arr2[i]);
		
	}
	
	}
	
	
	
	
}
