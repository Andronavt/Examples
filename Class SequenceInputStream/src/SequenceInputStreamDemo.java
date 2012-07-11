import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;


class SequenceInputStreamDemo {
	public static void main(String args[]) throws Exception{
		int c;
		Vector files=new Vector();
		files.addElement("test.txt");
		files.addElement("test1.txt");
		InputStreamEnumerator e=new InputStreamEnumerator(files);
		InputStream input=new SequenceInputStream(e);
		
		while((c=input.read())!=-1){
			System.out.print((char)c);
		}
		input.close();
	}

}
