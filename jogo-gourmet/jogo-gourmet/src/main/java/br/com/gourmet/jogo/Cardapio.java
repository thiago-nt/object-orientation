package br.com.gourmet.jogo;

import static br.com.gourmet.jogo.util.Constantes.BOLO_CHOCOLATE;
import static br.com.gourmet.jogo.util.Constantes.LASANHA;
import static br.com.gourmet.jogo.util.Constantes.MASSA;
import static br.com.gourmet.jogo.util.Constantes.OK;
import static br.com.gourmet.jogo.util.Constantes.TITULO;
import static br.com.gourmet.jogo.util.Constantes.PERGUNTA_INICIAL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Thiago N. Tavares
 *
 */
public class Cardapio {

	private CardapioGourmet cardapioGourmet;

	private void adicionandoValorPadrao() {
		cardapioGourmet = new CardapioGourmet(MASSA, LASANHA, BOLO_CHOCOLATE);
	}

	public void abrindoJogo() {
		this.adicionandoValorPadrao();
		perguntaInicial();
	}

	private void perguntaInicial() {
		JFrame screen = new JFrame(TITULO);
		screen.setVisible(true);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setLayout(null);
		screen.setSize(300, 120);
		screen.setLocationRelativeTo(null);
		JLabel label = createLabel();
		JButton button = createButton(cardapioGourmet);
		screen.add(label);
		screen.add(button);
	}

	private JLabel createLabel() {
		JLabel label = new JLabel(PERGUNTA_INICIAL);
		label.setBounds(55, 0, 260, 50);
		return label;
	}

	private JButton createButton(CardapioGourmet gourmetJogo) {
		JButton button = new JButton(OK);
		button.setBounds(85, 40, 90, 20);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gourmetJogo.pratoCorreto();
			}
		});
		return button;
	}
}
