package pokemon;

public class JigglyPuff extends Pokemon{
	public JigglyPuff() {
		super();
	}
	
	public JigglyPuff(int health, int level) {
		super('n', health, level);
		setSpeedBase(10);
		moves.add("Rollout"); 
		moves.add("Protect"); 
		moves.add("Recover");
	}
	
	public int move (int num) {
		if (num==1) {
			return (int)(50*getAStat()); 
		}
		else if(num == 2) {
			setProtected(true); 
			return 0;
		}
		
		else {
			if (getMaxHealth()/2 >= getHealth()) {
				this.addHealth(this.getMaxHealth()/2); //addHealth(getMaxHealth()/2);
			}
			
			else 
				this.setHealth(this.getMaxHealth()); 
			return 0; 
		}
	}
	
	
}
