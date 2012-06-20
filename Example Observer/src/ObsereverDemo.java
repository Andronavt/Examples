
public class ObsereverDemo {
	public static void main(String args[]){
		BeingWatcher observed=new BeingWatcher();
		Watcher observing=new Watcher();
		
		observed.addObserver(observing);
		observed.counter(10);
	}

}
