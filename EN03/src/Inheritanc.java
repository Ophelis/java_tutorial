
public class Inheritanc {
class parentClass{
	private int x,y;
	public parentClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public parentClass(){
		System.out.println("parent class construst");
	}
}

class childClass extends parentClass{
private int x,y;

public childClass(int x, int y, int x2, int y2) {
	super(x*2, y*2);
	x = x2;
	y = y2;
}
		
	}

public static void main(String[]args){
 
	
}
}
