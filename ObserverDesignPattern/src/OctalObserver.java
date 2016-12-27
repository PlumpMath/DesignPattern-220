
public class OctalObserver extends Observer {
	
	private Subject subject;
	
	public OctalObserver(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void getUpdate(Subject subj) {
		System.out.println("Getting update from subject is "+subj.getStatus()+" and the updated in octal is "+Integer.toOctalString(subj.getStatus()));
	}

}
