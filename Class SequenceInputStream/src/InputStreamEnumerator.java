import java.util.*;
import java.io.*;

class InputStreamEnumerator implements Enumeration{
	private Enumeration files;
	public InputStreamEnumerator(Vector files){
		this.files=files.elements();
	}
	public boolean hasMoreElements(){
		return files.hasMoreElements();
	}
	public  Object nextElement(){
		try{
			return new FileInputStream(files.nextElement().toString());
		}catch(Exception e){
			return null;
		}
	}

}
