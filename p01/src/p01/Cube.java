package p01;

public class Cube extends ThreeDimenShape {
float A,B,C;

public Cube(float a, float b, float c) {
	A = a;
	B = b;
	C = c;
}

@Override
public float getVolume() {
	
	return A*B*C;
}

}
