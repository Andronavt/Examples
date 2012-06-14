import java.util.ArrayList;


class ArrayListDemo {
	public static void main(String args[]){
		ArrayList a1=new ArrayList();
		System.out.println("Basic size a1: "+a1.size());
		
		a1.add("X");
		a1.add("A");
		a1.add("Z");
		a1.add("Q");
		a1.add("W");
		a1.add("E");
		a1.add(1,"G");
		
		System.out.println("Size a1 after adding: "+a1.size());
		
		System.out.println("Contents of a1: "+a1);
		
		a1.remove("Q");
		a1.remove(2);
		
		System.out.println("Size a1 after delete: "+a1.size());
		System.out.println("Contents of a1: "+a1);
		
		
	}

}
