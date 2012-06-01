
public class OverloadCons2 {
public static void main(String args[]){
	Box mybox1=new Box(10,20,15);
	Box mybox2=new Box();
	Box cube=new Box(7);
	Box myclone=new Box(mybox1);
	double vol;
	
	vol=mybox1.volume();
	System.out.println("Objem my1: "+ vol);
	
	vol=mybox2.volume();
	System.out.println("Objem my2: "+ vol);

	vol=cube.volume();
	System.out.println("Objem cube: "+ vol);
	
	vol=myclone.volume();
	System.out.println("Objem clone: "+ vol);
}
}
