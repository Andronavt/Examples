
class TwoObservers {
	public static void main(String args[]){
		BeingWatcher observed=new BeingWatcher();
		Watcher1 observing1=new Watcher1();
		Watcher2 observing2=new Watcher2();
		
		observed.addObserver(observing1);
		observed.addObserver(observing2);
		
		observed.counter(10);
	}

}
