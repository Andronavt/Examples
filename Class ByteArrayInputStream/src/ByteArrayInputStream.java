import java.io.*;
class ByteArrayInputStream {
	public ByteArrayInputStream(byte[] b) {
		// TODO Auto-generated constructor stub
	}

	public ByteArrayInputStream(byte[] b, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){
		String tmp="abcderf...";
		byte b[]=tmp.getBytes();
		ByteArrayInputStream input1=new ByteArrayInputStream(b);
		ByteArrayInputStream input2=new ByteArrayInputStream(b,0,3);
	}

}
