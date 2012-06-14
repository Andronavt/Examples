import java.util.*;

class IteratorDemo {
	public static void main(String args[]){
		
		ArrayList a1=new ArrayList();
		
		a1.add("S");
		a1.add("A");
		a1.add("Q");
		a1.add("W");
		a1.add("E");
		a1.add("R");
		a1.add("T");
		
		System.out.println("Contents of a1:"+a1);
		
		Iterator itr=a1.iterator();
		
		while(itr.hasNext()){
			Object elements =itr.next();
			System.out.print(elements+" ");
		}
		System.out.println();
		
		ListIterator litr=a1.listIterator();
		while(litr.hasNext()){
			Object element=litr.next();
			litr.set(element+"+");
		}
		System.out.print("Modified contents a1: ");
		itr=a1.iterator();
		while(itr.hasNext()){
			Object element=itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		
		System.out.println("Modified list: ");
		while(litr.hasPrevious()){
			Object element=litr.previous();
			System.out.print(element+" ");
		}
		System.out.println();
		
	}

}
