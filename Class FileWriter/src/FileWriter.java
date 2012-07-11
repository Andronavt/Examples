import java.io.*;
class FileWriter {
	public FileWriter(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) throws Exception{
		String source="This is sparta!!\n"
				+"time to ....\n"
				+"noooooooooooo\n";
		char[] buffer=new char[source.length()];
		source.getChars(0,source.length(),buffer,0);
		
		FileWriter f0=new FileWriter("file1.txt");
		for(int i=0;i<buffer.length;i+=2){
			f0.write(buffer[i]);
		}
		f0.close();
		
		FileWriter f1=new FileWriter("file2.txt");
		f1.write(buffer);
		f1.close();
		
		FileWriter f2=new FileWriter("file3.txt");
		
		f2.write(buffer,buffer.length-buffer.length/4,buffer.length/4);
		f2.close();
	
	}


}
