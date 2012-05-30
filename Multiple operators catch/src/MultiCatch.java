
class MultiCatch {
	public static void main(String args[]){
		try{
			int a=args.length;
			System.out.println("a = "+a);
			int b=42/a;
			int c[]={1};
			c[42]=99;
		}catch(ArithmeticException e){
			System.out.println("Zero"+e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index of element array oob: "+e);
		}
		System.out.println("After block try/catch.");
	}

}
