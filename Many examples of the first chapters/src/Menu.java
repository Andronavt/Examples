import java.io.IOException;


public class Menu {
public static void main(String args[]) throws IOException{
char choice;

	do{
		System.out.println("Spravka:");
		System.out.println("   1.if");
		System.out.println("   2.switch");
		System.out.println("   3.while");
		System.out.println("   4.do while");
		System.out.println("   5.for\n");
		System.out.println("Vubir:");
		choice = (char)System.in.read();
	}while(choice<'1' || choice>'5');
	System.out.println("\n");
	switch(choice){
	case '1':
		System.out.println("Yslovno if:\n");
		System.out.println("if (condition) statement");
		System.out.println("else statement2");
	break;
	case '2':
		System.out.println("switch");
		System.out.println("Wos tam");
		break;
	case '3':
		System.out.println("while");
		break;
	case '4':
		System.out.println("do while");
		break;
	case '5':
		System.out.println("for");
		break;
	
	
}
}
}
