import java.util.*;


class CompDemo {
	public static void main(String args[]){
		
		TreeSet ts=new TreeSet(new MyComp());
		
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		Iterator i=ts.iterator();
		
		while(i.hasNext()){
			Object element =i.next();
			System.out.print(element+" ");
		}
		System.out.println();
	}

}
