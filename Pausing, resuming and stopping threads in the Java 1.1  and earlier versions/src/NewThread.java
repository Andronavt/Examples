
class NewThread implements Runnable{
	String name;
	Thread t;
	
	NewThread(String threadname){
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New Thread: "+t);
		t.start();
	}
	
	public void run(){
		try{
			for(int i=15;i>0;i--){
				System.out.println(name+": "+i);
				Thread.sleep(200);
			}
		}catch(InterruptedException e){
			System.out.println(name + " interrupt.");
		}
		System.out.println(name+" completed.");
	}

}
