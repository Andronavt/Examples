import java.util.*;
class MyComp implements Comparator{
	public int compare(Object a,Object b){
		String aStr,bStr;
		
		aStr=(String)a;
		bStr=(String)b;
		
		return bStr.compareTo(aStr);
	}

}
