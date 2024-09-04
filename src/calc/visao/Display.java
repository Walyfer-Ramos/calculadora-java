package calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import calc.modelo.Memoria;
import calc.modelo.MemoriaObservador;
 							// conhecido como conteiners JPanel é uma janela dentro desta janela que vai abrir :)
@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{

	private final JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 30));
		
		add(label);
	}
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);								
	}
}
