import java.util.HashMap;
import java.util.Map;


public class ballotUnit {
	public static void main(String[] s) {
		
	/*//array of candidates contesting elections with number of votes
	Map<String,Integer> contestingCandidate = new HashMap<String, Integer>();
	contestingCandidate.put("Pratiksha",0);
	contestingCandidate.put("Alisha",0);
	contestingCandidate.put("Nazeef",0);
	contestingCandidate.put("Bindiya",0);*/
	}
	String contestingCandidate[] = {"Pratiksha", "Alisha", "Nazeef", "Alisha"};
	public String[] getcontestingCandidate(){
		return contestingCandidate;
	}
	candidateButton cb1=new candidateButton();
	
	public void relaseBallot(){
		readyLamp readylampBusy=new readyLamp();
		readylampBusy.setLampState("Busy");
		System.out.println("Lamp : "+readylampBusy.getLampState());
	}
	
}
