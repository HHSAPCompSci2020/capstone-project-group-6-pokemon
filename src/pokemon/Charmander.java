package pokemon;

public class Charmander extends Pokemon{
	public Charmander() {
		super();
	}
	
	public Charmander(int health, int level) {
		super('f', health, level);
		speedBase = 30;
	}
	
	public int ember () {
		return (int)(40*aStatM); 
	}  
	
	public int protect () {
		isProtected = true; 
		return 0; 
	} 
	
	public int blaze () {
		aStatN ++; 
		sStatN ++; 
		return 0; 
	}
}
