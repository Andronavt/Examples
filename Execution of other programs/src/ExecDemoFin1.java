
class ExecDemoFin1 {
	public static void main(String atgs[]){
		Runtime r=Runtime.getRuntime();
		Process p=null;
		
		try{
			p=r.exec("notepad");
			p.waitFor();
		}catch(Exception e){
			System.out.println("Erorr execution ");
		}
		System.out.println("Program compled"+p.exitValue());
	}

}
