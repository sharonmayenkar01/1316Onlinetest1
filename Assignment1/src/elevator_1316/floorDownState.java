package elevator_1316;

public class floorDownState extends floor {
	public floorDownState(){
		floor="ground";
	}
	
	public void switchState(context c){
		floorUpState o=new floorUpState();
		c.setState(o);
		System.out.println("Elevator has moved to floor: " +o.getStateName());
	}


}
