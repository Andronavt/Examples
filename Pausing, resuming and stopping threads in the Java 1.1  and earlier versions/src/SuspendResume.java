
class SuspendResume {
	public static void main(String args[]){
		NewThread ob1=new NewThread("First");
		NewThread ob2=new NewThread("Second");
	    
		try{
			Thread.sleep(1000);
			ob1.t.suspend();
			System.out.println("Interrupted First thread");
			Thread.sleep(1000);
			ob1.t.resume();
			System.out.println("Restart First thread");
			ob2.t.suspend();
			System.out.println("Interrupted Second thread");
			Thread.sleep(1000);
			ob2.t.resume();
			System.out.println("Restart Second thread");
		}catch(InterruptedException e){
			System.out.println("Interrupt Main Thread");
		}
		try{
			System.out.println("Wait completed threads");
			ob1.t.join();
			ob2.t.join();
		}catch(InterruptedException e){
			System.out.println("Interrupt Main Thread");
		}
		System.out.println("Completed Main Thread");
	}

}
