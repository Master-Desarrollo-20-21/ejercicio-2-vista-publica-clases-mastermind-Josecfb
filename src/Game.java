public class Game {
	private int attempts;
	private SecretCombination secret;
	private ProposedCombination[] combinationsAttempts;

	public Game() {
		this.attempts=0;
		this.secret=new SecretCombination();
		this.combinationsAttempts=new ProposedCombination[10];
		secret.muestra();
		
	}
	public void start() {
		ProposedCombination proposed;
		do  {
			showAttents();
			proposed=askAttent();
			System.out.println(secret.blacks(proposed)+" blacks and "+secret.whites(proposed)+" whites");
			this.combinationsAttempts[attempts]=proposed;
			this.attempts++;
		}while (this.attempts<=10 && secret.blacks(proposed)!=4);
	}
	
	private void showAttents() {
		System.out.println(attempts+" attempt(s):\nxxxx");
		for (int i=0;i<this.attempts-1;i++) {
			combinationsAttempts[i].muestra();
			
		}
	}
	
	public ProposedCombination askAttent() {
		GestorIO gestorIO=new GestorIO();
		ProposedCombination proposedCombination;
		do {
			System.out.println("Propose a combination: ");
			proposedCombination=new ProposedCombination(gestorIO.inString().toUpperCase());
		}while (!proposedCombination.isValidCombi());
		proposedCombination.muestra();
		return proposedCombination;
	}
	

}
