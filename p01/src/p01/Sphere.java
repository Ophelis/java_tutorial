package p01;

public class Sphere extends ThreeDimenShape{
final float pi = 3.14f;
int r;
public Sphere(int r) {
	this.r = r;
}

public float getVolume(){
	return 4/3*pi*r*r*r;
	
}
}
