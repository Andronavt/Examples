
class ThreadDemo {
	public static void main(String args[]){
		new NewThread();
		
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("interrupt of main thread.");
		}
		System.out.println("The end of Main Thread.");
	}

}
