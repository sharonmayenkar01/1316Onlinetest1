package elevator_1316;

import elevator_chain.Elevator;
import elevator_chain.FirstFloor;
import elevator_chain.SecondFloor;
import elevator_chain.ThirdFloor;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int currentFloorNum=1;
	
		FirstFloor s = new FirstFloor();
		ThirdFloor vp = new ThirdFloor();
		SecondFloor p = new SecondFloor();
		
		s.setSuccessor(vp);
		vp.setSuccessor(p);
		
		
		System.out.println("**************");
		Elevator p1 = new Elevator(2);
		s.allocate(p1);
		
		//Elevator p2 = new Elevator(3);
		//s.allocate(p2);
		System.out.println("***************");
		context ca =new context(new floorDownState());
		ca.switchState();
		ca.switchState();
		ca.switchState();
	}

	}


