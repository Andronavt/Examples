
public class TestNewStack {
public static void main(String args[]){
	NewStack mystack1=new NewStack();
	NewStack mystack2=new NewStack();
	for(int i=0;i<10;i++) mystack1.push(i);
	for(int i=10;i<20;i++) mystack2.push(i);
	
	System.out.println("Stack in mystack1: ");
	for(int i=0;i<10;i++)
		System.out.println(mystack1.pop());
	System.out.println("Stack in mystack2: ");
	for(int i=10;i<20;i++)
		System.out.println(mystack2.pop());
}
}
