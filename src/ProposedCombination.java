
public class ProposedCombination extends Combination{
	
	public ProposedCombination(String positions) {
		super();
		for (int i=0;i<LENGHT;i++)
			this.positions[i] = positions.charAt(i);
	}
	
	public boolean isValidCombi() {
		if (positions.length!=4) {
			System.out.println("Wrong proposed combination length");
			return false;
		}
		if (isWrongColorCombi(positions)) {
			System.out.println("Wrong colors, they must be: rbygop");
			return false;
		}
		return true;
	}
	
	private boolean isWrongColorCombi(char[] combi) {
		for (int i=0;i<combi.length;i++)
			if (!isValidColor(combi[i]))
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
