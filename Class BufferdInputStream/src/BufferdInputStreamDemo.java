import java.io.*;
class BufferdInputStreamDemo {
	public static void main(String args[]) throws IOException{
		String s="This: &copy; trololol, "+
	"and this: &copy - not.\n";
		byte buf[]=s.getBytes();
		ByteArrayInputStream in=new ByteArrayInputStream(buf);
		BufferedInputStream f=new BufferedInputStream(in);
		int c;
		boolean marked=false;
		
		while((c=f.read())!=-1){
			switch(c){
			case '&':
				if(!marked){
					f.mark(32);
					marked=true;
				}else{
					marked=false;
				}
				break;
			case ';':
				if(marked){
					marked=false;
					System.out.print(c);
				}else
					System.out.print((char)c);
					break;
					case ' ':
						if(marked){
							marked=false;
							f.read();
							System.out.print("&");
						}else
							System.out.print((char)c);
							break;
							default:
								if(!marked)
									System.out.print((char)c);
								break;
						
				
			}
		}
	}

}
