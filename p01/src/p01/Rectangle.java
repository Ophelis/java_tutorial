package p01;

public class Rectangle extends twoDImenShape{
int width,height;

public Rectangle(int width, int height) {
	this.width = width;
	this.height = height;
}
	
public float getArea(){
	return width*height;
}
}
