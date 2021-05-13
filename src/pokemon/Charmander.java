package pokemon;

public class Charmander extends Pokemon{
	public Charmander() {
		super();
	}
	
	public Charmander(int health, int level) {
		super('f', health, level);
		setSpeedBase(30);
		moves.add("Ember"); 
		moves.add("Protect"); 
		moves.add("Blaze");
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
			changeAstat(1);
			changeSstat(1);
			return 0; 
		}
	}
	
	
}
