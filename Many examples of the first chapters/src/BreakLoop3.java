
public class BreakLoop3 {
public static void main(String args[]){
	for(int i=0;i<100;i++){
		System.out.print("Iterat "+i + ": ");
		for(int j=0;j<100;j++){
			if(j==10)break;
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("End of Cycle");
}
}
