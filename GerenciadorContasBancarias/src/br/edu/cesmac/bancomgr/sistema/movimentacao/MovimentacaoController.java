package br.edu.cesmac.bancomgr.sistema.movimentacao;

import br.edu.cesmac.bancomgr.bancoDeDados.BDController;
import br.edu.cesmac.bancomgr.bancoDeDados.IBD;

public class MovimentacaoController implements IMovimentacao {
private IBD bancoDados;
	
	public MovimentacaoController() {
		this.bancoDados = new BDController();
	}

	@Override
	public void sacar(int numeroConta, int senha, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numeroConta, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numeroContaOrigem, int senha, float valor, int numeroContaDestino) {
		// TODO Auto-generated method stub

	}

}
