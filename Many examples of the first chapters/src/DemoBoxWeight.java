
public class DemoBoxWeight {
public static void main(String args[]){
	BoxWeight mybox1=new BoxWeight(10,20,15,34.3);
	BoxWeight mybox2=new BoxWeight(2,3,4,0.076);
	double vol;
	vol=mybox1.volume();
	System.out.println("Objem mybox1= "+vol);
	System.out.println("Massa mybox1= "+mybox1.weight);
	System.out.println();
	
	vol=mybox2.volume();
	System.out.println("Objem mybox2= "+vol);
	System.out.println("Massa mybox2= "+mybox2.weight);
}
}
