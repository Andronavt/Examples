
class RTTI {
	public static void main(String args[]){
		X x=new X();
		Y y=new Y();
		Class clObj;
		
		clObj=x.getClass();
		System.out.println("x object type: "+clObj.getName());
		clObj=y.getClass();
		System.out.println("y object type: "+clObj.getName());
		clObj=clObj.getSuperclass();
		System.out.println("For y superclass: "+clObj.getName());
	}

}
