import java.util.Random;

public class SecretCombination extends Combination {
	
	public SecretCombination() {
		super();
		combinationGenerator();
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
	
	


}
