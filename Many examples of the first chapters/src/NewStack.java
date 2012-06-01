
public class NewStack {
private int stck[]=new int[10];
private int tos;
NewStack(){
	tos=-1;
}
void push(int item){
	if(tos==9)
		System.out.println("Stack full");
	else 
		stck[++tos]=item;
}
int pop(){
	if(tos<0){
		System.out.println("Stack clear");
		return 0;
	}
	else 
		return stck[tos--];
}
}
