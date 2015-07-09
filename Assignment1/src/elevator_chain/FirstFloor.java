package elevator_chain;

public class FirstFloor extends MyApprover{
	
public void allocate(Elevator p){
	if(p.getFloorNum() == 1){
		System.out.println("elevator on floor number " +p.getFloorNum());
	}
	else {
		//System.out.println("Floor Number not approved by elevator");
	successor.allocate(p);
	}
	
}
}
