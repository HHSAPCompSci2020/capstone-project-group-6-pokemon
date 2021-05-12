package pokemon;

public class JigglyPuff extends Pokemon{
	public JigglyPuff() {
		super();
	}
	
	public JigglyPuff(int health, int level) {
		super('n', health, level);
		setSpeedBase(10);
	}
	
	public int rollout () {
		return (int)(50*getAStat()); 
	}  
	
	public int protect () {
		setProtected(true); 
		return 0; 
	} 
	
	public int recover () {
		if (getMaxHealth()/2 >= getHealth()) {
			this.addHealth(this.getMaxHealth()/2); //addHealth(getMaxHealth()/2);
		}
		
		else 
			this.setHealth(this.getMaxHealth()); 
		return 0; 
	}
}
