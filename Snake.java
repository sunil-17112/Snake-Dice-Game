class SnakeBiteException extends Exception{
	public SnakeBiteException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
class Snake extends Tile {

	
	public Snake(int t,int m) {
		// TODO Auto-generated constructor stub
		super(t,m);
		
	}
	private void checked(int a) throws SnakeBiteException{
		if(this.getTile()<=a) {
			throw new SnakeBiteException("It can't go beyond Tile-1");
		}
		
	}
	
	@Override
	protected int damage(int n) {
		// TODO Auto-generated method stub
		
		try {
			int r=super.random(2);
			if(r==1) {
			int a=super.damage(3);
			System.out.println("Hiss...! I am a Snake, you go back " + a + " tiles!");
			//check exception
			checked(a);
			return -a;
			}
			else {
				int a=super.damage(10);
				System.out.println("Hiss...! I am a Snake, you go back " + a + " tiles!");
				//check exception
				checked(a);
				return -a;
			}
		
		}
		catch(SnakeBiteException e) {
			System.out.println(e.getMessage());
			return -(this.getTile()-1);
		}
		
		
	}
	
}
