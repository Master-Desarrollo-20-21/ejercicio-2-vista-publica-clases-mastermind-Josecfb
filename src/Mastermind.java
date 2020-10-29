
public class Mastermind {
	public static void main(String[] args) {
		
		GestorIO gestorIO = new GestorIO();
		
		char resume;
		do {
			Play play=new Play();
			play.start();
			play.askAttent();
			gestorIO.out("Resume (Y/N");
			resume=gestorIO.inChar();
			
		}while (resume!='N' && resume!='n');
		
//		for (int i=0;i<cad.length();i++) {
//			if (!"rybgpo".contains(String.valueOf(cad.charAt(i))))
//					System.out.println("no válido");
//			
//		}
		Combination com1=new Combination("GYBR");
		Combination com2=new Combination("ROPG");
		System.out.println(com1.whites(com2));
		System.out.println(com1.blacks(com2));
		
		
	}
	
	

}
