
class ExtendsThread {
	public static void main(String args[]){
		new NewThread();
		
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main thread: "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Interrupted Main thread.");
		}
		System.out.println("End main thread.");
	}

}
