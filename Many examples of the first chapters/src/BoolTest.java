
public class BoolTest {
public static void main(String args[]){
	boolean b;
	b=false;
	System.out.println("b ravno" + b);
	b=true;
	System.out.println("b tavno" + b);
	
	if(b)System.out.println("vukonano");
	b=false;
	if(b) System.out.println("ne vukonano");
	System.out.println("chu 10>9" + (10>9));
}
}
