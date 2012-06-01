
public class Outer {
int outer_x=100;
/*void test(){
	Inner inner =new Inner();
	inner.display();
}*/
/*class Inner{
	void display(){
		System.out.println("In display: outer_x= " + outer_x);
	}
}*/
void test(){
	for(int i=0;i<10;i++){
		class Inner{
			void display(){
				System.out.println("in display: outer_x= " + outer_x);
			}
		}
		Inner inner=new Inner();
		inner.display();
	}
}
}
