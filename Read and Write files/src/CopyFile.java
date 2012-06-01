import java.io.*;
class CopyFile {
	public static void main(String args[]) throws IOException{
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		
		try{
			
			try{
				fin=new FileInputStream(args[0]);
			}catch(FileNotFoundException e){
				System.out.println("File not found");
				return;
			}
			
			try{
				fout=FileOutputStream(args[1]);
			}catch(FileNotFoundException e){
				System.out.println("Error to open file");
				return;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Copy File");
			return;
		}
		
		try{
			do{
				i=fin.read();
				if(i!=-1) fout.write(i);
			}while(i!=-1);
		}catch(IOException e){
			System.out.println("Files Error");
		}
		fin.close();
		fout.close();
	}

}
