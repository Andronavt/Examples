
class Exc2 {
	public static void main(String args []){
		int d,a;
		try{
			d=0;
			a=42/d;
			System.out.println("This is SPARTA!");
		}
		catch(ArithmeticException e){
			System.out.println("Zero WTF!");
		}
		System.out.println("After operator catch.");
	}

}
