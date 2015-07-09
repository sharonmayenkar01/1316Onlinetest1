package elevator_chain;

public class SecondFloor extends MyApprover{
	public void allocate(Elevator p){
		if(p.getFloorNum() == 2){
	
			System.out.println("elevator on floor number " +p.getFloorNum());
		}
		else {
			//System.out.println("Floor Number approved by elevator");
	
		}
		
	}

}
