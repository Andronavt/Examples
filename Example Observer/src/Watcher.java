import java.util.Observable;
import java.util.Observer;


class Watcher implements Observer{
	public void update(Observable obj,Object arg){
		System.out.println("update() called,count equally "+((Integer)arg).intValue());
	}

}
