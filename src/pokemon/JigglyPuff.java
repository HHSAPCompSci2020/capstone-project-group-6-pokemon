package pokemon;

public class JigglyPuff extends Pokemon{
	public JigglyPuff() {
		super();
	}
	
	public JigglyPuff(int health, int level) {
		super('n', health, level);
		speedBase = 10;
	}
	
	public int rollout () {
		return (int)(50*aStatM); 
	}  
	
	public int protect () {
		isProtected = true; 
		return 0; 
	} 
	
	public int recover () {
		if (maxHealth/2 >= health) {
			health+= maxHealth/2;
		}
		
		else 
			health = maxHealth; 
		return 0; 
	}
}
