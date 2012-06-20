import java.util.*;


class Watcher1 implements Observer{
	public void update(Observable obj,Object arg){
		System.out.println("update() called,count equally "+((Integer)arg).intValue());
	}

}
