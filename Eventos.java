import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos {

	public static void main(String[] args) {
		Marco window = new Marco();
		

	}

}


class Marco extends JFrame{
	public Marco() {
		setVisible(true);
		setBounds(500, 500, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lamina lamina = new Lamina();
		add(lamina);
		
	}
}


class Lamina extends JPanel{
	JButton boton = new JButton("Azul");
	public Lamina() {
		add(boton);
	}
}