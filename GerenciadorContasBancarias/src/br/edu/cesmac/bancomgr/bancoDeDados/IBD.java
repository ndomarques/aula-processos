package br.edu.cesmac.bancomgr.bancoDeDados;

import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Banco;
import br.edu.cesmac.bancomgr.sharedmodel.CategoriaCliente;
import br.edu.cesmac.bancomgr.sharedmodel.Cliente;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.TarifaTransacaoCliente;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

public interface IBD {
	public List<Conta> obterContas();
	public List<Transacao> obterTransacoes();
	public Banco obterBanco();
	public Conta getContaPassandoNumeroComoParametro(int numero);
	
	public void definirDadosBanco(Banco b);
	
	//INSERCAO
	public void adicionarConta(Conta c);
	public void adicionarTransacao(Transacao t);
	
	public void adicionarCategoriaCliente(CategoriaCliente c);
	public void adicionarTarifaTransacaoCliente(TarifaTransacaoCliente ttc);
	public void adicionarCliente(Cliente c);
	
	//EXCLUSAO
	public void excluirConta(Conta c);
	public void excluirTransacao(Transacao t);
		
	public void excluirCategoriaCliente(CategoriaCliente c);
	public void excluirTarifaTransacaoCliente(TarifaTransacaoCliente ttc);
	public void excluirCliente(Cliente c);
	
	//ALTERACAO
	public void alterarConta(int numero, Conta c);
	public void alterarTransacao(int id, Transacao t);
			
	public void alterarCategoriaCliente(int id, CategoriaCliente c);
	public void alterarTarifaTransacaoCliente(int id, TarifaTransacaoCliente ttc);
	public void alterarCliente(int id, Cliente c);
}
