import java.util.Iterator;
import java.util.LinkedList;



class MailList {
	public static void main(String args[]){
		LinkedList m1=new LinkedList();
		
		m1.add(new Address("J.W.West","11 Oak Ave","Urbana","IL","61801"));
		m1.add(new Address("Ralph Baker","1142 Maple Lane","Mahome","IL","61853"));
		m1.add(new Address("Tom Carlton","867 Elm St","Champaign","IL","61820"));
		
		Iterator itr=m1.iterator();
		while(itr.hasNext()){
			Object element=itr.next();
			System.out.println(element+"\n");
		}
		System.out.println();
		
	}

}
