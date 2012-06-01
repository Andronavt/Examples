
class Instanceof {
	public static void main(String atgs[]){
		A a=new A();
		B b=new B();
		C c=new C();
		D d=new D();
		
		if (a instanceof A)
			System.out.println("a  copy class A");
		if(b instanceof B)
			System.out.println("b  copy class B");
		if(c instanceof C)
			System.out.println("c copy class C");
		if(c instanceof A)
			System.out.println("type c can lead to type A");
		if(a instanceof C)
			System.out.println("type a can lead to type C");
		System.out.println();
		
		
		 A ob;
		 ob=d;
		 System.out.println("ob now links d");
		 if (ob instanceof D)
			 System.out.println("ob now copy class D");
		 
		 System.out.println();
		 
		 ob=c;
		 System.out.println("ob now links c");
		 if (ob instanceof C)
			 System.out.println("type d can copy to type D");
		 else
			 System.out.println("type d cant copy to type D");
		 if (ob instanceof A)
			 System.out.println("type ob can copy to type A");
		 
		 System.out.println();
		 
		 
		 if(a instanceof Object)
			 System.out.println("type a can copy to type Object");
		 if(b instanceof Object)
			 System.out.println("type b can copy to type Object");
		 if (c instanceof Object)
			 System.out.println("type c can copy to type Object");
		 if(d instanceof Object)
			 System.out.println("type d can copy to type Object");
	}

}
