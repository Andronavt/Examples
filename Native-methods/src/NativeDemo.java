
public class NativeDemo {
	int i;
	public static void main(String args[]){
		NativeDemo ob=new NativeDemo();
		
		ob.i=10;
		System.out.println("This bo.i before native-method: "+ob.i);
		ob.test();
		System.out.println("This ob.i after native-method: "+ob.i);
	}
	public native void test();
	
	static{
		System.out.println("NativeDemo");
	}

}
