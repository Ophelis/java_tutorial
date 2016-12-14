package p01;

public class Cylinder extends ThreeDimenShape {
final float pi = 3.14f; 

int r,height;

	public Cylinder(int r, int height) {
	super();
	this.r = r;
	this.height = height;
}

	@Override
	public float getVolume() {
		return pi*r*r*height;
	}

}
