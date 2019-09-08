
 class Tile extends RandomNumber {

	 private final int tile;
	 private final int Max;
	public Tile(int t,int m) {
		// TODO Auto-generated constructor stub
		super();
		this.tile=t;
		this.Max=m;
	}
	protected int damage(int n) {
		return super.random(n);
	}
	protected int getTile() {
		return tile;
	}
	protected int getMax() {
		return Max;
	}
}
