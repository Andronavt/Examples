
public class B extends A{
int k;
int i;
B(int a,int b){
	super.i=a;
	i=b;
}
void show(){
	System.out.println("i with super class: "+super.i);
	System.out.println("i with sub class: "+i);
}
void showk(){
	System.out.println("k: "+k);
}
void sum(){
	System.out.println("i+j+k: "+(i+j+k));
}
}
