
class A {
	synchronized void foo(B b){
		String name=Thread.currentThread().getName();
		System.out.println(name+" entered in A.foo");
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("A interrupt");
		}
		System.out.println(name+ " attempts to call B.last()");
		b.last();
	}
	synchronized void last(){
		System.out.println("inside A.last");
	}

}
