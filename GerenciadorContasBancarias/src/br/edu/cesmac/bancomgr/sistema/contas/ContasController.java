package br.edu.cesmac.bancomgr.sistema.contas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.cesmac.bancomgr.bancoDeDados.BDController;
import br.edu.cesmac.bancomgr.bancoDeDados.IBD;
import br.edu.cesmac.bancomgr.sharedmodel.Banco;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Poupanca;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Transacao> obterExtrato(int numeroConta, int senha, Date dataInicio, Date dataFim) {
		 List<Conta> listaContasDoBancoOk;
		 List<Transacao> listaTransacoesOK;
		 List<Transacao> listaMinhasTransacoes = new ArrayList<Transacao>();
		 	
		listaContasDoBancoOk = bancoDados.obterContas();
		listaTransacoesOK = bancoDados.obterTransacoes();

		for (int i =0; i<listaContasDoBancoOk.size(); i++){
			if (listaContasDoBancoOk.get(i).getNumero() == numeroConta && listaContasDoBancoOk.get(i).validarSenha(senha)){
					for (int j =0; j<listaTransacoesOK.size(); j++){
						if ( listaTransacoesOK.get(j).getData().before(dataInicio) && listaTransacoesOK.get(j).getData().after(dataFim) ){
							listaMinhasTransacoes.add(listaTransacoesOK.get(j));
						}
					}
				
				
			}else{
				JOptionPane.showMessageDialog(null, "Conta não existente ou senha invalida");
			}
		}
		return listaMinhasTransacoes;
	}

	@Override
	public List<Transacao> obterExtrato(int numeroConta, int senha) {
   		 List<Conta> listaContasDoBancoOk;
		 List<Transacao> listaTransacoesOK;
		 List<Transacao> listaMinhasTransacoes = new ArrayList<Transacao>();
		 	
		listaContasDoBancoOk = bancoDados.obterContas();
		listaTransacoesOK = bancoDados.obterTransacoes();

		for (int i =0; i<listaContasDoBancoOk.size(); i++){
			if (listaContasDoBancoOk.get(i).getNumero() == numeroConta && listaContasDoBancoOk.get(i).validarSenha(senha)){
					for (int j =0; j<listaTransacoesOK.size(); j++){
						listaMinhasTransacoes.add(listaTransacoesOK.get(j));
					}
				
			}else{
				JOptionPane.showMessageDialog(null, "Conta não existente ou senha invalida");
			}
		}
		return listaMinhasTransacoes;
	}

}
