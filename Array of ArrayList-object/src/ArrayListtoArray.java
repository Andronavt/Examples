import java.util.ArrayList;


class ArrayListtoArray {
	public static void mian(String args[]){
		
		ArrayList a1=new  ArrayList();
		
		a1.add(new Integer(1));
		a1.add(new Integer(2));
		a1.add(new Integer(3));
		a1.add(new Integer(4));
		
		System.out.println("Contents of object a1: "+a1);
		
		Object ia[]=a1.toArray();
		
		int sum=0;
		
		for(int i=0;i<ia.length;i++){
			sum+=((Integer) ia[i]).intValue();
			
			System.out.println("Sum :"+sum);
		}
	}

}
