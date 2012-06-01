
class B {
	synchronized void ba(A a){
		String name=Thread.currentThread().getName();
		System.out.println(name+ " entered in B.bar");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("B interrupt");
		}
		System.out.println(name+" attempts to call A.last()");
		a.last();
	}
	synchronized void last(){
		System.out.println("Inside A.last");
	}

}
