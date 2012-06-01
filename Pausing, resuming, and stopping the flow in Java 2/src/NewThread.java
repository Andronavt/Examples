
class NewThread implements Runnable{
	String name;
	Thread t;
	boolean suspendFlag;
	
	NewThread(String threadname){
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New Thread: "+t);
		suspendFlag=false;
		t.start();
	}
	public void run(){
		try{
			for(int i=15;i>0;i--){
				System.out.println(name+ ": "+i);
				Thread.sleep(200);
				synchronized (this){
					while(suspendFlag){
						wait();
					}
				}
			}
		}catch(InterruptedException e){
			System.out.println(name+ " interrupt");
		}
		System.out.println(name+ " completed");
	}
	
	void mysuspend(){
		suspendFlag=true;
	}
	synchronized void myresume(){
		suspendFlag=false;
		notify();
	}

}
