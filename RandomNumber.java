import java.util.Random;
public class RandomNumber {

	private Random rand;
	public RandomNumber() {
		// TODO Auto-generated constructor stub
		this.rand=new Random();
	}
			
	protected int random(int x) throws IllegalArgumentException{// exception handling
		try {
			return rand.nextInt(x)+1;
		}
		catch(IllegalArgumentException e) {
			return 1;
		}
	}
}
