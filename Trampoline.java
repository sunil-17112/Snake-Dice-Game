class TrampolineBiteException extends Exception{
	 public TrampolineBiteException(String msg) {
		// TODO Auto-generated constructor stub
		 super(msg);
	}
}
public class Trampoline extends Tile{

	
	public Trampoline(int t,int m) {
		// TODO Auto-generated constructor stub
		super(t,m);
		
	}
	private void checked(int a) throws TrampolineBiteException{
		if(this.getTile()+a>this.getMax()) {
			throw new TrampolineBiteException("It can't go beyond Max Tile");
		}
		
	}
	
	@Override
	protected int  damage(int n){
		// TODO Auto-generated method stub
		try {
			int r=super.random(2);
			if(r==1) {
				int a=super.damage(3);
				System.out.println("PingPong! I am a Trampoline, you advance " + a + " tiles!");
				//check exception
				checked(a);
				return a;
			}
			else {
				int a=super.damage(10);
				System.out.println("PingPong! I am a Trampoline, you advance " + a + " tiles!");
				//check exception
				checked(a);
				return a;
			}
			
		}
		catch(TrampolineBiteException e) {
			System.out.println(e.getMessage());
			
			return 0;
		}
		
		
		
	}
}
