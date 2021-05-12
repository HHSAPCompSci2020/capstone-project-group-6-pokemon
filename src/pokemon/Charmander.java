package pokemon;

public class Charmander extends Pokemon{
	public Charmander() {
		super();
	}
	
	public Charmander(int health, int level) {
		super('f', health, level);
		setSpeedBase(30);
	}
	
	public int ember () {
		return (int)(40*getAStat()); 
	}  
	
	public int protect () {
		setProtected(true); 
		return 0; 
	} 
	
	public int blaze () {
		changeAstat(1);
		changeSstat(1);
		return 0; 
	}
}
