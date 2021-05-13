package pokemon;

public class Squirtle extends Pokemon{
	public Squirtle() {
		super();
	}
	
	public Squirtle(int health, int level) {
		super('g', health, level);
		setSpeedBase(40);
		moves.add("Water Gun"); 
		moves.add("Protect"); 
		moves.add("Calm Mind"); 
	}
	
	
	public int move (int num) {
		if (num==1) {
			return (int)(20*getAStat());
		}
		else if(num == 2) {
			setProtected(true); 
			return 0;
		}
		
		else {
			changeAstat(2); 
			changeSstat(2); 
			return 0; 
		}
	}
}
