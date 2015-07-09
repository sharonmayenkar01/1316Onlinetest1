package elevator_chain;

public class MyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstFloor s = new FirstFloor();
		ThirdFloor vp = new ThirdFloor();
		SecondFloor p = new SecondFloor();
		
		s.setSuccessor(vp);
		vp.setSuccessor(p);
		
		
		System.out.println("**************");
		//Elevator p1 = new Elevator(1);
		//s.allocate(p1);
		
		Elevator p2 = new Elevator(2);
		s.allocate(p2);

	}

}
