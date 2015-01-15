
public class StrongMan extends Hero {

	public StrongMan(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.boostStrength();
	}

	private void boostSpeed(){
		this.strength +=50;	
		if(this.strength >100){
			this.strength=100;
}

	}
}