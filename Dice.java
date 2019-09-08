
public class Dice extends RandomNumber{

	private final int numfaces;
	public Dice() {
		// TODO Auto-generated constructor stub
		this.numfaces=6;
	}
	protected int roll() {
		return super.random(this.numfaces);
	}
}
