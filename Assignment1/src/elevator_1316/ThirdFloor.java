package elevator_1316;

public class ThirdFloor extends MyApprover{
	
	public void allocate(elevator p){
	if(p.getFloorNum() == 3){
		System.out.println("elevator on floor number" +p.getFloorNum());
	}
	else {
		//System.out.println("Floor Number 3 approved by elevator");
	successor.allocate(p);
	}
	
}
}
