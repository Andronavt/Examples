import java.io.File;


class FileDemo {
	static void p(String s){
		System.out.println(s);
	}
	public static void main(String args[]){
		File fl=new File("/Examples/README");
		p("Name fil: "+fl.getName());
		p("Path: "+fl.getPath());
		p("Catalog: "+fl.getParent());
		p(fl.exists() ? "exists" : "not exists");
		p(fl.canWrite() ? "write" : "not write");
		p(fl.canRead() ? "read" : "not read");
		p("Size file: "+fl.length()+" byte");
		
	}


}
