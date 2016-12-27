
public class HexObserver extends Observer {
	
	private Subject s;
	
	public HexObserver(Subject s) {
		this.s = s;
		s.registerObserver(this);
	}

	@Override
	public void getUpdate(Subject subj) {
		System.out.println("Getting update for :: "+subj.getStatus()+" and the hex conversion is "+Integer.toHexString(subj.getStatus()));
	}

}
