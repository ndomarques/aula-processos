package br.edu.cesmac.bancomgr.sistema.movimentacao;

import br.edu.cesmac.bancomgr.bancoDeDados.BDController;
import br.edu.cesmac.bancomgr.bancoDeDados.IBD;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.TransacaoDual;

import java.util.Date;
import java.util.List;

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
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numeroContaOrigem, int senha, float valor, int numeroContaDestino) {
		List<Conta> contas = bancoDados.obterContas();
		Conta contaOrigem = contas.stream().filter(c->c.getNumero() == numeroContaOrigem).
										    filter(c->c.validarSenha(senha)).findFirst().orElse(null);
		Conta contaDestino = contas.stream().filter(c->c.getNumero() == numeroContaDestino).findFirst().orElse(null);

		if (contaOrigem.getSaldo() >= valor) {
			sacar(numeroContaOrigem, senha, valor);
			depositar(numeroContaDestino, valor);
			TransacaoDual transacaoDual = new TransacaoDual(0, "Transferência", valor, new Date(), contaOrigem, contaDestino);
			contaOrigem.addTransacoesComoOrigem(transacaoDual);
			contaDestino.addTransacoesComoDestino(transacaoDual);
		}
	}

}
