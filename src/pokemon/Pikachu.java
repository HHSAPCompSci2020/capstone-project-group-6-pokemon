package pokemon;

public class Pikachu extends Pokemon{
	public Pikachu() {
		super();
	}
	
	public Pikachu(int health, int level) {
		super('e', health, level);
		setSpeedBase(60);
		moves.add("Nuzzle"); 
		moves.add("Protect"); 
		moves.add("Agility");
	}
	
	public int move (int num) {
		if (num==1) {
			return (int)(60*getAStat()); 
		}
		else if(num == 2) {
			setProtected(true); 
			return 0;
		}
		
		else {
			changeSstat(2); 
			return 0;
		}
	}
	
	
}
