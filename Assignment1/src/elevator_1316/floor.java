package elevator_1316;

public abstract class floor {
	floor succesor,predecessor;
protected String floor;
	
	abstract void switchState(context c);

	public String getStateName() {
		return floor;
	}
	
}
