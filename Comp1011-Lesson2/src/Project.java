
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate hero
		Strongan Hero hero= new StrongMan("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();
		
		Villain villain= new Villain(" Sly Man");
		villain.run();
		villain.steals();
		villain.showAbilities();
		
		//instiantiate vigilante
		Vigliante vigliante = new Vigliante("Ms. Savage");
		Vigliante.run();
		Vigliante.steals();
		Vigliante.dealsJustice();
	}

}
