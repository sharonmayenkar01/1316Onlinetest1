package noDP;

public class Door{
	private Elevator e;
	

	public Door(){
		this.e = new Elevator();
		e.setState("Door is opened");    
	}

	public String getState(){
		return e.getState();
	}
	
}
