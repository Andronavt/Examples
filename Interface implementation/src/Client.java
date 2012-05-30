
class Client implements Callback{
	
	public void callback(int p){
		System.out.println("callback invoked with an argument "+p);
	}
	void nonIfaceMeth(){
		System.out.println("Classes implement the interface"+
	                        "should also identify other members of the");
	}

}
