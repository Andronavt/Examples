
public class Triangle extends Figure{
	Triangle(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("In Area for Triangle");
		return dim1*dim2/2;
	}

}
