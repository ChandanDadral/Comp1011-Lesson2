
public class Hero {
	//Private Properties
    private int strength;
    private int speed;
    private int health;
    
    //Public Properties
    public String name;

    //Getter section
	public int getStrength() {
		return strength;
	}

	public int getSpeed() {
		return speed;
	}

	public int getHealth() {
		return health;
	}
	//getter ends here
	
	//constructor ********>>>>>>>>>
	public Hero(String name){
		this.name=name;
		
		generateAbilities();
	}
	
	
	private void generateAbilities(){
		
	}
	
	public void fight(){
		
	}
	
	public void run(){
		
	}


	


	


}
