import java.util.*;


class AlgorithmsDemo {
	public static void main(String args[]){
		
		LinkedList l1=new LinkedList();
		
		l1.add(new Integer(-8));
		l1.add(new Integer(20));
		l1.add(new Integer(-20));
		l1.add(new Integer(8));
		
		Comparator r=Collections.reverseOrder();
		
		
		Collections.sort(l1,r);
		
		Iterator li=l1.iterator();
		
		System.out.println("List sorted : ");
		while(li.hasNext())
			System.out.print(li.next()+" ");
			System.out.println();
		Collections.shuffle(l1);
		
		li=l1.iterator();
		System.out.print("Random list: ");
		while(li.hasNext())
			System.out.print(li.next());
		System.out.println();
		
		System.out.println("Min: "+Collections.min(l1));
		System.out.println("Max: "+Collections.max(l1));
		
	}

}
