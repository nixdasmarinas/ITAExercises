package Exercise1_2;


public class RideCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle cycle = new Cycle();
		Unicycle unicycle = new Unicycle();
		Bicycle bicycle = new Bicycle();
		Tricycle tricycle = new Tricycle();
		Cycle[] cycleArray = new Cycle[5];
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		///////////////   								EXER 1 	             //////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * 
		 * Explicit implementation of upcasting. Output will be the ride() from Cycle class.
		 *
		 */
			unicycle.ride();
			bicycle.ride();
			tricycle.ride();
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		///////////////   								EXER 2 	             //////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * 
		 * Upcasting and downcasting. 
		 * ERROR1: balance cannot be called since one subclass is not implemented with the method from the other two.
		 * ERROR2: the tricycle subclass cannot call the balance since it does not have any balance method from the Cycle class.
		 */
		
		//for(Cycle s: cycleArray) {
			//cycleArray[s].balance(); ERROR1!
		//}
		
		cycleArray[0] = (Unicycle) unicycle;
		cycleArray[1] = (Bicycle) bicycle;
		cycleArray[2] = (Tricycle) tricycle;
		
		unicycle = (Unicycle) cycleArray[0];
		bicycle = (Bicycle) cycleArray[1];
		tricycle = (Tricycle) cycleArray[2];
		
		
		unicycle.balance();
		bicycle.balance();
		// tricycle.balance(); ERROR2!
		
		
	}

}
