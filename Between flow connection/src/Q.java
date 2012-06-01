
class Q {
	int n;
	boolean valueSet=false;
	synchronized int get(){
		if(!valueSet)
				try{
					wait();
				}catch(InterruptedException e){
					System.out.println("InterruptedException eject");
				}
		System.out.println("received: "+n);
		valueSet=false;
		notify();
		return n;
	}
	synchronized void put(int n){
		if(valueSet)
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("InterruptedException eject");
			}
		this.n=n;
		valueSet=true;
		System.out.println("given: "+n);
		notify();
	}

}
