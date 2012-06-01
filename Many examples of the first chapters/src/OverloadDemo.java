
public class OverloadDemo {
void test(){
	System.out.println("Non param");
}
/*
void test(int a){
	System.out.println("a: "+a);
}*/
void test(int a,int b){
	System.out.println("a and b: " + a+""+ b);
}
/*
double test(double a){
	System.out.println("Double a:"+a);
	return a*a;
}*/
void test(double a){
	System.out.println("inside test(double) a:"+a);
}
}
