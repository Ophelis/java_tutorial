package p02;
import java.util.Random;
java.util.Random;
public class Player extends Cha{
	int hp = 10;
	@Override
	public int attack() {
		
		Random random = new Random();
		return random.nextInt(5);
		
	}
	
}

