
public class Conversion {
public static void main(String atgs[]){
	byte b;
	int  i= 257;
	double d = 323.142;
	System.out.println("\nPruvedenja int v byte");
	b=(byte)i;
	System.out.println("i and b " + i + "" +b);
	System.out.println("\ndoible v int");
	i=(int)d;
	System.out.println("d and i" + d + "" + i);
	System.out.println("\ndouble v byte");
	b=(byte)d;
	System.out.println("d and b" + d + "" + b);
}
}
