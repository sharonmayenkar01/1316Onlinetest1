
public class candidateButton extends ballotButton {
//pressed by voter
	public int pra1=10,ali2=11,naz3=34,bin4=23;
	public int castYourVote(){
		ballotUnit ballotUnit=new ballotUnit();
	   //select your choice
		System.out.println("Cast your vote");
		this.pra1=pra1+1;
		return pra1;
	}
}
