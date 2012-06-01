
public class BoxWeight extends Box {
double weight;//masa bloka
BoxWeight(BoxWeight ob){
super (ob);
weight=ob.weight;
}



/*BoxWeight(double w,double h,double d,double m){
	width=w;
	height=h;
	depth=d;
	weight=m;
}*/
BoxWeight(double w,double h,double d,double m){
	super(w,h,d);
	weight=m;
}

BoxWeight(){
	super();
	weight=-1;
}

BoxWeight(double len,double m){
	super(len);
	weight=m;
}
}
