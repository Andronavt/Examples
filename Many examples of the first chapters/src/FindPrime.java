
public class FindPrime {
public static void main(String args[]){
	int num;
	boolean isPrime=true;
	num=11;
	for(int i=2;i<num/2;i++){
		if((num%i)==0){
			isPrime=false;
			break;
		}
	}
	if(isPrime)System.out.println("Proste chuslo");
	else System.out.println("Chucslo ne proste");
}
}
