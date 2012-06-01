
class SuspendResume {
	public static void main(String args[]){
		NewThread ob1=new NewThread("First");
		NewThread ob2=new NewThread("Second");
		
		try{
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Interrupt First thread");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Restart First thread");
			ob2.mysuspend();
			System.out.println("Interrupt Second thread");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Restart Second thread");
		}catch(InterruptedException e){
			System.out.println("Interrupt Main thread");
		}
		try{
			System.out.println("Wair for completed threads");
			ob1.t.join();
			ob2.t.join();
		}catch(InterruptedException e){
			System.out.println("Interrupt Main thread");
		}
		System.out.println("Completed Main thread");
		
	}

}
