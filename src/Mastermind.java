
public class Mastermind {
	
	public static void main(String[] args) {	
		GestorIO gestorIO = new GestorIO();	
		char resume;
		do {
			new Game().start();
			gestorIO.out("Resume (Y/N");
			resume=gestorIO.inChar();			
		}while (resume!='N' && resume!='n');
		
	}

}
