public class Game {
	private int attempts;
	private Combination secret;
	private Combination[] combinationsAttempts;
	private final String POSIBLE_COLORS="RBYGOP";
	
	public Game() {
		this.attempts=0;
		this.secret=new Combination();
		this.combinationsAttempts=new Combination[10];
		secret.muestra();
		
	}
	public void start() {
		Combination proposed=null;
		do  {
			showAttents();
			proposed=askAttent();
			System.out.println(proposed.blacks(secret)+" blacks and "+proposed.whites(secret)+" whites");
			this.combinationsAttempts[attempts]=proposed;
			this.attempts++;
		}while (this.attempts<=10 && proposed.blacks(this.secret)!=4);
	}
	
	private void showAttents() {
		System.out.println(attempts+" attempt(s):\nxxxx");
		for (int i=0;i<this.attempts-1;i++) {
			combinationsAttempts[i].muestra();
			
		}
	}
	
	public Combination askAttent() {
		GestorIO gestorIO=new GestorIO();
		String proposedCombination;
		do {
			System.out.println("Propose a combination: ");
			proposedCombination=gestorIO.inString().toUpperCase();
		}while (!isValidCombi(proposedCombination));
		Combination combination = new Combination(proposedCombination) ;
		combination.muestra();
		return combination;
	}
	
	private boolean isValidCombi(String combi) {
		if (combi.length()!=4) {
			System.out.println("Wrong proposed combination length");
			return false;
		}
		if (isWrongColorCombi(combi)) {
			System.out.println("Wrong colors, they must be: rbygop");
			return false;
		}
		return true;
	}
	
	private boolean isWrongColorCombi(String combi) {
		for (int i=0;i<combi.length();i++)
			if (!isValidColor(combi.charAt(i)))
				return true;
		return false;
	}
	
	
	private boolean isValidColor(char color) {
		for (int i=0; i<POSIBLE_COLORS.length();i++) {
			if(color==POSIBLE_COLORS.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
