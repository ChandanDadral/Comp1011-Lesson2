
public class Speedster extends Hero {

	public Speedster(String name) {
		super(name);
		boostSpeed();
		// TODO Auto-generated constructor stub
	}
	//Private methods++++++++
	private void boostSpeed(){
	this.speed +=50;	
	if(this.speed >100){
		this.speed=100;
	}
	
	}
	
}
