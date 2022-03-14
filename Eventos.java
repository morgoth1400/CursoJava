import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


class Lamina extends JPanel implements ActionListener{
	JButton botonAzul = new JButton("Azul");
	JButton botonVerde = new JButton("Verde");
	JButton botonRojo = new JButton("Rojo");
	public Lamina() {
		add(botonAzul);
		add(botonRojo);
		add(botonVerde);
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonVerde.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e){
		Object botonPulsado=e.getSource();
		if(e.getSource()==botonAzul){
			setBackground(Color.blue);
		}else if(botonPulsado==botonRojo) {
			setBackground(Color.red);
		}else {
			setBackground(Color.green);
		}
		
		
	}
}