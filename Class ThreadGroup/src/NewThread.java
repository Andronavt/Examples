
class NewThread extends Thread{
	boolean suspendFlag;
	
	NewThread(String threadname,ThreadGroup tgOb){
		super(tgOb,threadname);
		System.out.println("New Thread: "+this);
		suspendFlag=false;
		start();
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println(getName()+": "+i);
				Thread.sleep(1000);
				synchronized(this){
					while(suspendFlag){
						wait();
					}
				}
			}
		}catch(Exception e){
			System.out.println("exception in "+getName());
		}
		System.out.println(getName()+" complet");
	}
	void mysuspend(){
		suspendFlag=true;
	}
	synchronized void myresume(){
		suspendFlag=false;
		notify();
	}

}
