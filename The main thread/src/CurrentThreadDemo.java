
class CurrentThreadDemo {
	public static void main(String args[]){
		Thread t= Thread.currentThread();
		System.out.println("Current thread: "+t);
		
		t.setName("My Thread");//chage name thread
		System.out.println("After a name change: "+t);
		
		try{
			for(int n=5;n>0;n--){
				System.out.println(n);
				t.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main thread end");
		}
		
	}

}
