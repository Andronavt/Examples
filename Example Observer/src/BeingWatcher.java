import java.util.Observable;


class BeingWatcher extends Observable{
	void counter(int period){
		for(;period>=0;period--){
			setChanged();
			notifyObservers(new Integer(period));
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				System.out.println("Sleep interrupted");
			}
		}
	}

}
