package elevator_1316;

public class floorUpState extends floor{
	public floorUpState(){
		floor="up";
	}
	
	public void switchState(context c){
		floorDownState down=new floorDownState();
		c.setState(down);
		System.out.println("Elevator has moved : " +down.getStateName());
	}

}
