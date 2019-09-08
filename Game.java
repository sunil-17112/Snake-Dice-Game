import java.util.*;
import java.NoExtraTiles;
import java.GameWinnerException;
import java.OutOfMemoryError;
public  final class Game { // class Immutable

	private final int numsnake;
	private final int numvulture;
	private final int numwhite;
	private final int numcricket;
	private final int numtrampolin;
	private final Tile[] arr; 
	private  final ArrayList<String>s;
	public Game(int n,String name)throws NoExtraTiles,GameWinnerException ,OutOfMemoryError{
		// TODO Auto-generated constructor stub
		
		Random rand=new Random();
		
		this.arr=new Tile[n];
		this.s=new ArrayList<String>();
		this.numwhite=n/4+1;
		this.numsnake=rand.nextInt(2*(n-this.numwhite)/3+1);
		this.numvulture=rand.nextInt(2*(n-this.numwhite-this.numsnake)/3+1);
		this.numcricket=rand.nextInt(n-this.numwhite-this.numvulture-this.numsnake+1);
		this.numtrampolin=n-this.numcricket-this.numsnake-this.numvulture-this.numwhite;
		Random_Generator(n);
		new Player(n, name,arr);
		
	
	}
	private void Random_Generator(int n) throws NoExtraTiles,GameWinnerException,OutOfMemoryError{
		
		
		for(int i=0;i<=this.numwhite;i++) {
			s.add("W");
		}
		for(int i=0;i<=this.numsnake;i++) {
			s.add("S");
		}
		for(int i=0;i<=this.numcricket;i++) {
			s.add("C");
		}
		for(int i=0;i<=this.numvulture;i++) {
			s.add("V");
		}
		for(int i=0;i<=this.numtrampolin;i++) {
			s.add("T");
		}
		Collections.shuffle(s);
		
		for(int i=0;i<n;i++) {
			if(s.get(i).equals("W")) {
				arr[i]=new White(i+1,n);
			}
			else if(s.get(i).equals("S")) {
				arr[i]=new Snake(i+1,n);
			}
			else if(s.get(i).equals("V")) {
				arr[i]=new Vulture(i+1,n);
			}
			else if(s.get(i).equals("C")) {
				arr[i]=new Cricket(i+1,n);
			}
			else {
				arr[i]=new Trampoline(i+1,n);
			}
		}
		
		
		
		
	}
	
	public static void main(String[] args) throws NoExtraTiles,GameWinnerException,OutOfMemoryError{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean Done=false;
		int n=0;
		while(!Done) {
			try {
				System.out.print("Enter the total number of tiles : ");
				n=sc.nextInt(); // use exception handling
				System.out.println("");
				Done=true;
			}
			catch(InputMismatchException e) {
				System.out.println("Invaid Integer");
				System.out.println("Try Again");
				sc.nextLine();
			}
		}
		if(n<=0) {
			System.out.println("End the Game");
		}
		else {
			System.out.print("Enter the player name : ");
			String name=sc.next();// exception handling
			System.out.println("");
			try {
			new Game(n,name);
			}
			catch(OutOfMemoryError e) {
				System.out.println("Out Of Memory");
				System.out.println("end the Game");
			}
			
			System.out.println("End the game");
		}
		
		
		

	}

}
