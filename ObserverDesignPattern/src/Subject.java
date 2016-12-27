/*
 * It has all the independent information. Will update observers accordingly.
 */
public class Subject {
	
	public Observer[] observerArray= new Observer[10];
	
	public int currentLenght = 0;
	
	public int status = 0;
	
	public void registerObserver(Observer o){
		observerArray[currentLenght++] = o;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
		updateObservers();
	}
	
	public void updateObservers(){
		for(int i =0; i<currentLenght; i++){
			System.out.println("Updating observer "+i);
			observerArray[i].getUpdate(this);
		}
	}
	
	

}
