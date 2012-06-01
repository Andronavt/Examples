
public class NewStack2 {
private int stck[];
private int tos;
NewStack2(int size){
	stck=new int [size];
	tos=-1;
}
void push(int item){
	if(tos==stck.length)
		System.out.println("Stack full");
	else 
		stck[++tos]=item;
	
}
int pop(){
	if(tos<0){
		System.out.println("Stack null");
		return 0;
	}
	else
		return stck[tos--];
}
}
