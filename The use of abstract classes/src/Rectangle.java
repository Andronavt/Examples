
public class Rectangle extends Figure{
	Rectangle(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("In Area for Rectangle");
		return dim1*dim2;
	}
	

}
