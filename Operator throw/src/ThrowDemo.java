
class ThrowDemo {
	static void demoproc(){
		try{
			throw new NullPointerException("demo");
		}catch(NullPointerException e){
			System.out.println("Catch in demoproc.");
			throw e;
		}
	}
	public static void main(String args[]){
		try{
			demoproc();
		}catch(NullPointerException e){
			System.out.println("Repeat catch: "+e);
		}
	}

}
