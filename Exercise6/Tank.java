package Exercise6;

public class Tank {
	
	public boolean isEmpty=false;
	public String name;
	
	public Tank(String name) {
		this.name = name;
	}
	public  void filledTank() {
		this.isEmpty=false;
	}
	
	public void emptyTank(){
		this.isEmpty=true;
	}
	
	public void finalize () throws Throwable
    {
        if(this.isEmpty==false)
        {
           System.err.println(name + " should be empty!");
        }
        else {
        	 System.out.println(name + " is empty");
        }
    }

}