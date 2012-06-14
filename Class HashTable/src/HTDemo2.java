import java.util.*;
class HTDemo2 {
	public static void main(String args[]){
		Hashtable balance =new Hashtable();
		String str;
		double bal;
		
		balance.put("John Doe",new Double(3434.34));
		balance.put("Tom Smith",new Double(123.22));
		balance.put("Tod Hall",new Double(99.22));
		balance.put("Ralph Smith",new Double(-19.08));
		
		Set set=balance.keySet();
		
		Iterator i=set.iterator();
		
		while(i.hasNext()){
			str=(String)i.next();
			System.out.println(str+": "+balance.get(str));
		}
		System.out.println();
		
		bal=((Double)balance.get("John Doe")).doubleValue();
		balance.put("John Doe",new Double(bal+1000));
		System.out.println("New balance John: "+balance.get("John Doe"));
	}

}
