
public class Box {
/*double width;
double height;
double depth;*/
	private double width;
	private double height;
	private double depth;
Box(Box ob){
	width=ob.width;
	height=ob.height;
	depth=ob.depth;
}
Box(double w,double h,double d){
	width=w;
	height=h;
	depth=d;
}
Box(){
	width=-1;
	height=-1;
	depth=-1;
}
Box(double len){
	width=height=depth=len;
}
/*Box(){
	System.out.println("Create Box");
	width=10;
	height=10;
	depth=10;
}*/
/*void volume(){
	System.out.print("Objem ");
	System.out.println(width*height*depth);
}*/
double volume(){
	return width*height*depth;
}

/*void setDim(double w,double h,double d){
	width=w;
	height=h;
	depth=d;
}*/
}
