import java.io.*;
class CharArrayWriterDemo {
	public static void main(String args[]) throws IOException{
		CharArrayWriter f=new CharArrayWriter();
		String s="This should end up in the array";
		char buf[]=new char[s.length()];
		s.getChars(0, s.length(), buf, 0);
		f.write(buf);
		System.out.println("Buffer consist in string: ");
		System.out.println(f.toString());
		System.out.println("Array consist: ");
		
		char c[]=f.toCharArray();
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
		
		System.out.println("\nInput buffer in FileWriter");
		FileWriter f2=new FileWriter("test.txt");
		f.writeTo(f2);
		f2.close();
		System.out.println("Using reset()");
		f.reset();
		for(int i=0;i<3;i++)
			f.write('X');
		System.out.println(f.toString());
	}

}
