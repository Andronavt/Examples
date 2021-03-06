import java.util.*;
class PropDemo {
	public static void main(String args[]){
		Properties capitals=new Properties();
		Set states;
		String str;
		
		capitals.put("Illinois","Springfiels");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");
		
		states=capitals.keySet();
		Iterator i=states.iterator();
		
		while(i.hasNext()){
			str=(String)i.next();
			System.out.println("Capital of state: "+str+" - "+capitals.getProperty(str)+".");
		}
		
		System.out.println();
		
		str=capitals.getProperty("Florida","not found");
		System.out.println("Capital of state Florida - "+str+".");
	}

}
