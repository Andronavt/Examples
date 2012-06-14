import java.util.*;


class TreeMapDemo2 {
	public static void main(String args[]){
		
		TreeMap tm=new TreeMap(new TComp());
		
		tm.put("John Doe",new Double(3434.34));
		tm.put("Tom Smith",new Double(123.22));
		tm.put("Jane Baker",new Double(1378.00));
		tm.put("Tod Hall",new Double(99.22));
		tm.put("Ralph Smith",new Double(-19.08));
		
		Set set=tm.entrySet();
		
		Iterator i=set.iterator();
		
		while(i.hasNext()){
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey());
			System.out.println(me.getValue());
		}
		System.out.println();
		
		double balance=((Double)tm.get("John Doe")).doubleValue();
		tm.put("John Doe",new Double(balance+1000));
		
		System.out.println("New blance John Doe:"+tm.get("John Doe"));
	}

}
