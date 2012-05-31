
class HiLoPri {
	public static void main(String args[]){
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker hi=new Clicker(Thread.NORM_PRIORITY+2);
		Clicker lo=new Clicker(Thread.NORM_PRIORITY-2);
		
		lo.start();
		hi.start();
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("Interrupted main thread.");
		}
		lo.stop();
		hi.stop();
		
		try{
			hi.t.join();
			lo.t.join();
		}catch(InterruptedException e){
			System.out.println("InterruptedException caught.");
		}
		System.out.println("low-priority thread: "+lo.click);
		System.out.println("hight-priority thread: "+hi.click);
		
	}

}
