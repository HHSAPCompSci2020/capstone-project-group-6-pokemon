package pokemon;

public class Bulbasaur extends Pokemon {
	
	
	
	
	
	
	public Bulbasaur() {
		super();
	}
	
	public Bulbasaur(int health, int level) {
		super('g', health, level);
		speedBase = 40;
	}
	
	public int vineWhip () {
		return (int)(40*aStatM); 
	}  
	
	public int protect () {
		isProtected = true; 
		return 0; 
	} 
	
	public int growth () {
		aStatN +=2; 
		return 0; 
	}
	
}
