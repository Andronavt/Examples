
public class RefDemo {
public static void main(String args[]){
	BoxWeight weightbox=new BoxWeight(3,5,7,8.37);
	Box plainbox=new Box();
	double vol;
	vol=weightbox.volume();
	System.out.println("Objem weightbox= "+vol);
	System.out.println("Massa weightbox= "+weightbox.weight);
	System.out.println();
	
	plainbox=weightbox;
	vol=plainbox.volume();
	System.out.println("Objem plainbox= "+vol);
}
}
