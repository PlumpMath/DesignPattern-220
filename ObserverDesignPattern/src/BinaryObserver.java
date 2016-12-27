
public class BinaryObserver extends Observer {
	
	private Subject subj;
	
	public BinaryObserver(Subject subj) {
		this.subj = subj;
		subj.registerObserver(this);
	}

	@Override
	public void getUpdate(Subject subj) {
		System.out.println("Getting new update for "+subj.getStatus()+" converting to binary :: "+Integer.toBinaryString(subj.getStatus()));
	}

}
