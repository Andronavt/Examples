
public class CallByRef {
public static void main(String atgs[]){
	Test ob=new Test(15,20);
	System.out.println("ob.a and ob.b pered call: "+ ob.a+" "+ob.b);
	ob.meth(ob);
	System.out.println("after call: "+ob.a+" "+ob.b);
	
}
}
