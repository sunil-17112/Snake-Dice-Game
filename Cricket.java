class CricketBiteException extends Exception{
	public CricketBiteException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
public class Cricket extends Tile{

	
	public Cricket(int t,int m) {
		// TODO Auto-generated constructor stub
		super(t,m);
	
	}
	private void checked(int a) throws CricketBiteException{
		if(this.getTile()<=a) {
			throw new CricketBiteException("It can't go beyond Tile-1");
		}
		
	}
	
	@Override
	protected int damage(int n){
		// TODO Auto-generated method stub
		try {
			int r=super.random(2);
			if(r==1) {
				int a=super.damage(3);
				System.out.println("Chirp...! I am a Cricket, you go back " + a + " tiles!");
				//check exception
				checked(a);
				return -a;
			}
			else {
				int a=super.damage(10);
				System.out.println("Chirp...! I am a Cricket, you go back " + a + " tiles!");
				//check exception
				checked(a);
				return -a;
			}
		
		}
		catch(CricketBiteException e) {
			System.out.println(e.getMessage());
			return -(this.getTile()-1);
		}
		
		
	}
}
