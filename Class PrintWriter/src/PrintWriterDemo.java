import java.io.*;
class PrintWriterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintWriter pw=new PrintWriter(System.out, true);
		pw.println("This is line");
		int i=-7;
		pw.println(i);
		double d=4.5e-7;
		pw.println(d);
		

	}

}
