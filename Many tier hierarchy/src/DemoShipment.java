
public class DemoShipment {
public static void main(String args[]){
	Shipment shipment1=new Shipment(10,20,15,10,3.4);
	Shipment shipment2=new Shipment(2,3,4,0.76,1.28);
	
	double vol;
	
	vol=shipment1.volume();
	System.out.println("Objem sh1: "+vol);
	System.out.println("Massa sh1: "+shipment1.weight);
	System.out.println("Cost sh1: $"+shipment1.cost);
	System.out.println("");
	
	vol=shipment2.volume();
	System.out.println("Objem sh2: "+vol);
	System.out.println("Massa sh2: "+shipment2.weight);
	System.out.println("Cost sh2: $"+shipment2.cost);
}
}
