package pokemon;

public class Pikachu extends Pokemon{
	public Pikachu() {
		super();
	}
	
	public Pikachu(int health, int level) {
		super('e', health, level);
		speedBase = 60;
	}
	
	public int nuzzle () {
		return (int)(60*aStatM); 
	}  
	
	public int protect () {
		isProtected = true; 
		return 0; 
	} 
	
	public int agility () {
		sStatN +=2; 
		return 0; 
	}
}
