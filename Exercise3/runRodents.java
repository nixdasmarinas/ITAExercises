package Exercise3;

import java.util.ArrayList;

public class runRodents {
	
	/*
	 * Each type of rodent polymorphs the sniff function
	 * 
	 */
	public static void main(String args[]) {
		ArrayList<Rodent> rod = new ArrayList<Rodent>();
		Rodent rodents = new Rodent();
		Hamster hamster = new Hamster();
		Gerbil gerbil = new Gerbil();
		Mouse mouse = new Mouse();
		rod.add(hamster);
		rod.add(mouse);
		rod.add(gerbil);
		for(Rodent rodent : rod) {
			rodent.sniff();
		}		
	}

}
