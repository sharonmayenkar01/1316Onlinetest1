
public class EVM {
	
readyLamp readylampOn=new readyLamp();
ballotUnit ballotUnit=new ballotUnit();
candidateButton candidateButton=new candidateButton();
totalButton totalButton=new totalButton();
resultButton resultButton=new resultButton();

public void startEVM(){
	System.out.println("EVM turned on");
	readylampOn.setLampState("Glowing");
	System.out.println("Lamp : "+readylampOn.getLampState());
	//ballotUnit.getcontestingCandidate();
	//select your contestant
	ballotUnit.relaseBallot();
	candidateButton.castYourVote();
	System.out.println("Total Voters till now : "+totalButton.getTotalVotes());
	resultButton.getVotesForIndividual();
	resultButton.declareWinner();
}

public void stopEVM(){
	readylampOn.setLampState("Off");
	System.out.println("Lamp : "+readylampOn.getLampState());
}

}
