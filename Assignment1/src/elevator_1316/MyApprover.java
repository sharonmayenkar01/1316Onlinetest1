package elevator_1316;

public abstract class MyApprover {
	MyApprover successor;

	public void setSuccessor(MyApprover a){
		successor=a;
	}
	public abstract void allocate(elevator p);
}
