
public class Switch {
public static void main(String args[]){
	int m=4;
	String season;
	switch(m){
	case 12:
	case 1:
	case 2:
		season="Winter";
		break;
	case 3:
	case 4:
	case 5:
		season="Spring";
		break;
	case 6:
	case 7:
	case 8:
		season="Sumer";
		break;
	case 9:
	case 10:
	case 11:
		season="Automne";
		break;
		default:
			season="WTF";
	}
	System.out.println("April this "+season+".");
}
}
