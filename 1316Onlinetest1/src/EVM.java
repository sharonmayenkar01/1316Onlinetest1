
public class EVM {
	
readyLamp readylampOn=new readyLamp();
ballotUnit ballotUnit=new ballotUnit();
candidateButton candidateButton=new candidateButton();

public void startEVM(){
	System.out.println("EVM turned on");
	readylampOn.setLampState("Glowing");
	System.out.println("Lamp : "+readylampOn.getLampState());
	//ballotUnit.getcontestingCandidate();
	//select your contestant
	ballotUnit.relaseBallot();
	candidateButton.castYourVote();
}

public void stopEVM(){
	readylampOn.setLampState("Off");
	System.out.println("Lamp : "+readylampOn.getLampState());
}

}
