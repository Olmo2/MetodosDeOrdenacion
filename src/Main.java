import javax.swing.JFrame;

public class Main extends JFrame {
	
		public Main() {
			setTitle("Metodos De Oredenación");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().add(new Lienzo());
			pack();
		}
		
		public static void main(String[] args) {
		 
	new Main().setVisible(true);

}
}
