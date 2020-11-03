
public class Combination {
	protected char[] positions;
	protected final int LENGHT=4;
	protected final String POSIBLE_COLORS="RBYGOP";
	
	public Combination() {
		this.positions=new char[4];
	}
	
	protected int colorIsPresentIn(char color) {
		for (int i=0; i<LENGHT; i++){
			if (color==this.positions[i])
				return i;
		}
		return -1;
	}
	

	protected char numToColor(int num) {
		return POSIBLE_COLORS.charAt(num);
	}


	public void muestra() {
		for (int i=0; i<LENGHT; i++){
			System.out.print(this.positions[i]);
		}
		System.out.print("\n");
	}
	
}
