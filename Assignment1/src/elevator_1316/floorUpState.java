package elevator_1316;

public class floorUpState extends floor{
	public floorUpState(){
		floor="3";
	}
	
	public void switchState(context c){
		floorDownState down=new floorDownState();
		c.setState(down);
		System.out.println("Elevator has moved to floor : " +down.getStateName());
	}

}
