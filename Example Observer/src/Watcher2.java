import java.util.*;
class Watcher2 implements Observer{
	public void update(Observable obj,Object arg){
		
		if(((Integer)arg).intValue()==0)
			System.out.println("Done"+'\7');
	}

}
