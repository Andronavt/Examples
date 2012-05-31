
class DemoJoin {
	public static void main(String args[]){
		NewThread ob1=new NewThread("First");
		NewThread ob2=new NewThread("Second");
		NewThread ob3=new NewThread("Three");
		
		System.out.println("First thread execution: "+ob1.t.isAlive());
		System.out.println("Second thread execution: "+ob2.t.isAlive());
		System.out.println("Three thread execution: "+ob3.t.isAlive());
		
		try{
			System.out.println("Wait for completed thread.");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e){
			System.out.println("Interruped main thread.");
		}
		System.out.println("First thread execution: "+ob1.t.isAlive());
		System.out.println("Second thread execution: "+ob2.t.isAlive());
		System.out.println("Three thread execution: "+ob3.t.isAlive());
		
		System.out.println("completion main thread");
	}

}
