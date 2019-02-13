package br.com.gourmet.jogo;

import static br.com.gourmet.jogo.util.Constantes.CONFIRMANDO_ESCOLHA;
import static br.com.gourmet.jogo.util.Constantes.TITULO;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.OK_OPTION;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;

import br.com.gourmet.jogo.model.Prato;
import br.com.gourmet.jogo.service.EscolhaTiposDePratos;
import br.com.gourmet.jogo.service.OpcoesCardapio;

/**
 * 
 * @author Thiago N. Tavares
 *
 */
public class CardapioGourmet implements EscolhaTiposDePratos, OpcoesCardapio {

	private Prato prato;
	private EscolhaTiposDePratos primeiraPergunta = new EscolhaTiposDePratosImpl();
	private EscolhaTiposDePratos proximaPergunta = new EscolhaTiposDePratosImpl();

	public CardapioGourmet(String tipoPrato) {
		prato = new Prato(tipoPrato);
	}

	public CardapioGourmet(String tipoPrato, String primeiraPergunta, String proximasPerguntas) {
		prato = new Prato(tipoPrato);
		this.novoPrato(primeiraPergunta, proximasPerguntas);
	}

	private void novoPrato(String primeiraPergunta, String proximasPerguntas) {
		this.primeiraPergunta = new CardapioGourmet(primeiraPergunta);
		this.proximaPergunta = new CardapioGourmet(proximasPerguntas);
	}
	
	public void analisandoEscolhaDePrato() {
		int opcaoEscolhida = showConfirmDialog(null, String.format(CONFIRMANDO_ESCOLHA, prato.getNome()), TITULO, YES_NO_OPTION);
		switch (opcaoEscolhida) {
		case OK_OPTION:
			primeiraPergunta.pratoCorreto();
			break;
		case NO_OPTION:
			proximaPergunta.proximasOpcoesDoCardapio(this);
			break;
		}
	}

	@Override
	public void pratoCorreto() {
		this.analisandoEscolhaDePrato();
	}

	@Override
	public void proximasOpcoesDoCardapio(CardapioGourmet cardapioGourmet) {
		this.analisandoEscolhaDePrato();
	}

	@Override
	public void adicionarOpcoes(String respostaCorreta, String respostaErrada) {
		novoPrato(respostaCorreta, prato.getNome());
		prato = new Prato(respostaErrada);
	}
	
	public Prato getTipoPrato() {
		return prato;
	}
}
