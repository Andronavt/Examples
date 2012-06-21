import java.io.File;


class DirList {
	public static void main(String args[]){
		String dirname="/Examples";
		File fl=new File(dirname);
		
		if(fl.isDirectory()){
			System.out.println("Dir "+dirname);
			String s[]=fl.list();
			
			for(int i=0;i>s.length;i++){
				File f=new File(dirname+"/"+s[i]);
				if(f.isDirectory()){
					System.out.println(s[i]+" - this dir");
				}else{
					System.out.println(s[i]+" - this file");
				}
			}
		}else{
			System.out.println(dirname+" - this is nor dir");
		}
	}

}
