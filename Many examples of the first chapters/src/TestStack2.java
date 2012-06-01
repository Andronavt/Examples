
public class TestStack2 {
public static void main(String args[]){
	NewStack2 my1=new NewStack2(5);
	NewStack2 my2=new NewStack2(8);
	
	for(int i=0;i<5;i++) my1.push(i);
	for(int i=0;i<8;i++) my2.push(i);
	System.out.println("Stack my1: ");
	for (int i=0;i<5;i++)
		System.out.println(my1.pop());
	System.out.println("Stack my2: ");
	for (int i=0;i<8;i++)
		System.out.println(my2.pop());
}
}
