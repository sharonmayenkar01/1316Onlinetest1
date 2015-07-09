package elevator_1316;

public class context {
	private floor floor;

	public context(floor floor) {
	
		this.floor = floor;
	}
	
	public floor getState() {
		return floor;
	}

	public void setState(floor floor) {
		this.floor = floor;
	}

	public void switchState(){
		floor.switchState(this);
	}
}
