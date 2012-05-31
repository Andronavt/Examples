
class NewThread extends Thread{
	NewThread(){
		super("Demo Thread.");
		System.out.println("Child Thread: "+this);
		start();
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("End Child Thread.");
		}
	}

}
