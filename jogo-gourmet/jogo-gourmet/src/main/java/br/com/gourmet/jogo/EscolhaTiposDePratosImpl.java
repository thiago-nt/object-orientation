package br.com.gourmet.jogo;

import static br.com.gourmet.jogo.util.Constantes.ACERTO_SUCESSO;
import static br.com.gourmet.jogo.util.Constantes.TITULO;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import br.com.gourmet.jogo.service.EscolhaTiposDePratos;
import br.com.gourmet.jogo.util.Constantes;

public class EscolhaTiposDePratosImpl implements EscolhaTiposDePratos {

	@Override
	public void proximasOpcoesDoCardapio(CardapioGourmet jogoGourmet) {
		String novoPrato = showInputDialog(Constantes.NOVA_ESCOLHA);
		String respostaCompleta = String.format(Constantes.COMPLETAR_RESPOSTA, novoPrato, jogoGourmet.getTipoPrato().getNome());
		String receberNovoPrato = showInputDialog(respostaCompleta);
		jogoGourmet.adicionarOpcoes(novoPrato, receberNovoPrato);
	}

	@Override
	public void pratoCorreto() {
		showMessageDialog(null, ACERTO_SUCESSO, TITULO, QUESTION_MESSAGE);
	}
}
