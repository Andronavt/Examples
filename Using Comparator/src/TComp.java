import java.util.*;
class TComp implements Comparator{
	public int compare(Object a,Object b){
		int i,j,k;
		String aStr,bStr;
		
		aStr=(String)a;
		bStr=(String)b;
		
		i=aStr.lastIndexOf(' ');
		j=bStr.lastIndexOf(' ');
		
		k=aStr.substring(i).compareTo(bStr.substring(j));
		
		if(k==0)
			return aStr.compareTo(bStr);
		else
		    return k;
	}

}
