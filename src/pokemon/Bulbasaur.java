package pokemon;

public class Bulbasaur extends Pokemon {
	
	
	
	
	
	
	public Bulbasaur() {
		super();
	}
	
	public Bulbasaur(int health, int level) {
		super('g', health, level);
		setSpeedBase(40);
		moves.add("Vine Whip"); 
		moves.add("Protect"); 
		moves.add("Growth"); 
	}
	
	
	public int move (int num) {
		if (num==1) {
			return (int)(40*getAStat());
		}
		else if(num == 2) {
			setProtected(true); 
			return 0;
		}
		
		else {
			changeAstat(2); 
			return 0; 
		}
	}
	
	
	
}
