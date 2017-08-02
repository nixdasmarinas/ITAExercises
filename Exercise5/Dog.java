package Exercise5;

public class Dog {

	/*
	 * Overloads the method bark via different parameters
	 */
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public static void bark(String bark) {
		System.out.println(bark);
	}

	public static void bark(String bark, String type) {
		System.out.println("A" + type+ " : " + bark);
	}
	
	public static void bark(String bark, String type, int num) {
		System.out.println(num + " " + type + " " + bark);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bark("Arf!");
		bark("Puppy","arf arf!");
		bark("howl","Wolves", 3);
	}

}
