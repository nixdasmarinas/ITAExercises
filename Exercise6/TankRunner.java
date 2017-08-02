package Exercise6;

public class TankRunner {
	public static void main(String[] args) {
		
		/*
		 * Finalize method -- override checks the tank instances if they are empty or not
		 */
		Tank tank1=new Tank("Tank1");
		Tank tank2=new Tank("Tank2");
		Tank tank3=new Tank("Tank3");
		Tank tank4=new Tank("Tank4");
		
        tank1.filledTank();
        tank2.emptyTank();
        tank3.emptyTank();
        tank4.filledTank();

        try {
         tank1.finalize();
	     tank2.finalize();
	     tank3.finalize();
	     tank4.finalize();
        }
         catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
