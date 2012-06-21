import java.io.*;
class FileInputStreamDemo {
	public static void main(String args[]) throws Exception{
		int size;
		InputStream f=
				new FileInputStream("FileInputStreamDemo.java");
		System.out.println("All bytes: "+(size=f.available()));
		
		int n=size/40;
		System.out.println("First: "+n+" bytes file one read() reading at once.");
		for(int i=0;i<n;i++){
			System.out.println((char)f.read());
		}
		System.out.println("\nFree: "+f.available());
		System.out.println("Reading next: "+n+" using one read(b[])");
		
		byte b[]=new byte[n];
		if(f.read(b)!=n){
			System.out.println("couldn't read "+n+" bytes");
		}
		System.out.println(new String (b,0,n));
		System.out.println("\nFree : "+(size=f.available()));
		System.out.println("skip half free bytes skip()");
		f.skip(size/2);
		System.out.println("Free: "+f.available());
		System.out.println("Reading "+n/2+" bytes in end of array");
		if(f.read(b,n/2,n/2)!=n/2){
			System.out.println("couldn't read"+n/2+"bytes");
		}
		System.out.println(new String(b,0,b.length));
		System.out.println("\nFree: "+f.available());
		f.close();
		
	}

}
