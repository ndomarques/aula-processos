package br.edu.cesmac.bancomgr.sistema.movimentacao;

import javax.swing.JOptionPane;

import br.edu.cesmac.bancomgr.bancoDeDados.BDController;
import br.edu.cesmac.bancomgr.bancoDeDados.IBD;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;

public class MovimentacaoController implements IMovimentacao {
	private IBD bancoDados;
	
	public MovimentacaoController() {
		this.bancoDados = BDController.createInstance();
	}

	@Override
	public void sacar(int numeroConta, int senha, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numeroConta, float valor) {
		for (Conta conta : bancoDados.obterContas()) {
			if (conta.getNumero() == numeroConta) {
				conta.depositar(valor);
				JOptionPane.showMessageDialog(null, "Depósito efetuado com suscesso!");
				return;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Conta não encontrada!");
	}

	@Override
	public void transferir(int numeroContaOrigem, int senha, float valor, int numeroContaDestino) {
		// TODO Auto-generated method stub

	}

}
