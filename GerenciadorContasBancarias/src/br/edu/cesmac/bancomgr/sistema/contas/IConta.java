package br.edu.cesmac.bancomgr.sistema.contas;

import java.util.Date;
import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

public interface IConta {
	
	public int criarContaPoupanca(int numero, int senha, int diaAniversario, float taxaRendimento);
	public int criarContaCorrente(int numero, int senha, float limite, float taxaJuros);
	public int desativarConta(int numero);
	public int ativarConta(int numero);
	public float consultarSaldo(int numeroConta, int senha);
	public List<Transacao> obterExtrato(int numeroConta, int senha, Date dataInicio, Date dataFim);
	public List<Transacao> obterExtrato(int numeroConta, int senha);
}
