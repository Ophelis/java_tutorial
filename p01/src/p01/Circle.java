package p01;

public class Circle extends twoDImenShape {
 final float pi = 3.14f;
float r;
public Circle(float r) {
	this.r = r;
}
public float getArea(){
	return pi*r*r;
	
}
}
