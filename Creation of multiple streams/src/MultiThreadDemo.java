
class MultiThreadDemo {
	public static void main(String args[]){
		new NewThread("First");
		new NewThread("Second");
		new NewThread("Three");
		
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("Interrupted main thread.");
		}
		System.out.println("End main thread.");
	}

}
