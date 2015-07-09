package elevator_chain;

public class ThirdFloor extends MyApprover{
	
	public void allocate(Elevator p){
	if(p.getFloorNum() == 3){
		System.out.println("elevator on floor number " +p.getFloorNum());
	}
	else {
		//System.out.println("Floor Number approved by elevator");
	successor.allocate(p);
	}
	
}
}
