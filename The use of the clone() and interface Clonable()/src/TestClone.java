
class TestClone implements Cloneable{
	int a;
	double b;
	
	TestClone  cloneTest(){
		try{
			return (TestClone) super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println("not complet");
			return this;
		}
	}

	public Object clone(){
		try{
			return super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println("Not complet");
			return this;
		}
	}
}
