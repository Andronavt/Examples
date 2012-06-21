import java.io.*;
class OnlyExist implements FilenameFilter{
	String ext;
	public OnlyExist(String ext){
		this.ext="."+ext;
	}
	public boolean accept(File dir,String name){
		return name.endsWith(ext);
	}

}
