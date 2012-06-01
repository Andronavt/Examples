
public class Break {
public static void main(String args[]){
	boolean t=true;
	first:{
		second:{
		third:{
		System.out.println("Pered break");
		if(t)break second;
		System.out.println("dont");
	}
	System.out.println("dont");
	}
	System.out.println("Pislja second");
	}
}
}
