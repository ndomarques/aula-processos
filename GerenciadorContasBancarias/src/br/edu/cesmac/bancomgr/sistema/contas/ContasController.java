package br.edu.cesmac.bancomgr.sistema.contas;

import java.util.Date;
import java.util.List;

import br.edu.cesmac.bancomgr.bancoDeDados.BDController;
import br.edu.cesmac.bancomgr.bancoDeDados.IBD;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

public class ContasController implements IConta {
	private IBD bancoDados;
	
	public ContasController() {
		this.bancoDados = new BDController();
	}

	@Override
	public int criarContaPoupanca(int numero, int senha, int diaAniversario, float taxaRendimento) {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return 0;
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
