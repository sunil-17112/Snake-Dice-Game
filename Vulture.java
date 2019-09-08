class VultureBiteException extends Exception{
	public VultureBiteException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
public class Vulture extends Tile {

	
	public Vulture(int t,int m) {
		// TODO Auto-generated constructor stub
		super(t,m);
	
	}
	private void checked(int a) throws VultureBiteException{
		if(this.getTile()<=a) {
			throw new VultureBiteException("It can't go beyond Tile-1");
		}
		
	}
	
	@Override
	protected int  damage(int n){
		// TODO Auto-generated method stub
		try {
			int r=super.random(2);
			if(r==1) {
				int a=super.damage(3);
				System.out.println("Yapping...! I am a Vulture, you go back " + a + " tiles!");
				//check exception
				checked(a);
				return -a;
			}
			else {
				int a=super.damage(10);
				System.out.println("Yapping...! I am a Vulture, you go back " + a + " tiles!");
				//check exception
				checked(a);
				return -a;
			}
		
			
			
		}
		catch(VultureBiteException e) {
			System.out.println(e.getMessage());
			int b=this.getTile()-1;
			
			return -b;
		}
		
	}
}
