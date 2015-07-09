
public class EVM {
	
readyLamp readylampOn=new readyLamp();
ballotUnit ballotUnit=new ballotUnit();
candidateButton candidateButton=new candidateButton();
totalButton totalButton=new totalButton();
public void startEVM(){
	System.out.println("EVM turned on");
	readylampOn.setLampState("Glowing");
	System.out.println("Lamp : "+readylampOn.getLampState());
	//ballotUnit.getcontestingCandidate();
	//select your contestant
	ballotUnit.relaseBallot();
	candidateButton.castYourVote();
	System.out.println("Total Voters till now : "+totalButton.getTotalVotes());
	System.out.println("/nvotes for individuals");
	System.out.println("Contestant Alisha : "+candidateButton.ali2);
	System.out.println("Contestant Nazeef : "+candidateButton.naz3);
	System.out.println("Contestant Pratiksha : "+candidateButton.pra1);
	System.out.println("Contestant Bindiya : "+candidateButton.bin4);
}

public void stopEVM(){
	readylampOn.setLampState("Off");
	System.out.println("Lamp : "+readylampOn.getLampState());
}

}
