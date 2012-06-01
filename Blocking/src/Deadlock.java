
class Deadlock implements Runnable{
	A a=new A();
	B b=new B();
	
	Deadlock(){
		Thread.currentThread().setName("Main Thread");
		Thread t=new Thread(this, "RacingThread");
		t.start();
		
		a.foo(b);
		System.out.println("Return in mainthread");
	}
	public void run(){
		b.ba(a);
		System.out.println("Retutn int other thread");
	}
	public static void main(String args[]){
		new Deadlock();
	}

}
