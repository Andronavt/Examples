
public class FindAreas {
	public static void main(String aregs[]){
		Figure f=new Figure(10,10);
		Rectangle r=new Rectangle(9,5);
		Triangle t=new Triangle(10,8);
		
		Figure figref;
		
		figref=r;
		System.out.println("Area equal "+figref.area());
		
		figref=t;
		System.out.println("Area equal "+figref.area());
		
		figref=f;
		System.out.println("Area equal "+figref.area());
	}

}
