package br.edu.cesmac.bancomgr.sistema.contas;

import br.edu.cesmac.bancomgr.bancoDeDados.BDController;
import br.edu.cesmac.bancomgr.bancoDeDados.IBD;
import br.edu.cesmac.bancomgr.sharedmodel.Banco;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Poupanca;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

import java.util.Date;
import java.util.List;

public class ContasController implements IConta {
	private IBD bancoDados;
	
	public ContasController() {
		this.bancoDados = BDController.createInstance();
	}

	@Override
	public int criarContaPoupanca(int numero, int senha, int diaAniversario, float taxaRendimento) {
		Banco banco = this.bancoDados.obterBanco();
		Poupanca p = new Poupanca(numero, 0, senha, banco, diaAniversario, taxaRendimento);
		this.bancoDados.adicionarConta(p);
		return 1;
	}

	@Override
	public int criarContaCorrente(int numero, int senha, float limite, float taxaJuros) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int desativarConta(int numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ativarConta(int numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float consultarSaldo(int numeroConta, int senha) {
		List<Conta> contas = this.bancoDados.obterContas();
		Conta conta = contas.stream().filter(c->c.getNumero() == numeroConta).filter(c-> c.validarSenha(senha)).findFirst().orElse(null);
		return conta.getSaldo();
	}

	@Override
	public List<Transacao> obterExtrato(int numeroConta, int senha, Date dataInicio, Date dataFim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transacao> obterExtrato(int numeroConta, int senha) {
		// TODO Auto-generated method stub
		return null;
	}

}
