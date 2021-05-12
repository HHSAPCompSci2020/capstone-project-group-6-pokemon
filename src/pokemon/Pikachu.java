package pokemon;

public class Pikachu extends Pokemon{
	public Pikachu() {
		super();
	}
	
	public Pikachu(int health, int level) {
		super('e', health, level);
		setSpeedBase(60);
	}
	
	public int nuzzle () {
		return (int)(60*getAStat()); 
	}  
	
	public int protect () {
		setProtected(true); 
		return 0; 
	} 
	
	public int agility () {
		changeSstat(2); 
		return 0; 
	}
}
