import java.util.Random;

public class Combination {
	private char[] positions;
	private final int LENGHT=4;
	private final String POSIBLE_COLORS="RBYGOP";
	
	
	public Combination() {
		this.positions=new char[4];

		combinationGenerator();
	}

	public Combination(String positions) {
		this.positions=new char[4];
		for (int i=0;i<LENGHT;i++)
			this.positions[i] = positions.charAt(i);
	}
	


	private void combinationGenerator() {
		Random r=new Random();
		for (int i=0; i<LENGHT; i++) {
			char color=numToColor(r.nextInt(3));
			while (colorIsPresentIn(color)!=-1)
				color=numToColor(r.nextInt(6));
			this.positions[i]=color;
		}
	}
	
	private char numToColor(int num) {
		return POSIBLE_COLORS.charAt(num);
	}

	public int blacks(Combination combination) {
		int result=0;
		for (int i=0; i<LENGHT; i++)
			if (this.positions[i]==combination.positions[i])
				result++;
		return result;
	}
	
	public int whites(Combination combination) {
		int result=0;
		for (int i=0; i<LENGHT; i++) {
			int position=colorIsPresentIn(combination.positions[i]);
			if (position!=-1 && position!=i)
				result++;
		}
		return result;
	}
	
	private int colorIsPresentIn(char color) {
		for (int i=0; i<LENGHT; i++){
			if (color==this.positions[i])
				return i;
		}
		return -1;
	}
	
	public void muestra() {
		for (int i=0; i<LENGHT; i++){
			System.out.print(this.positions[i]);
		}
		System.out.print("\n");
	}
	
}
