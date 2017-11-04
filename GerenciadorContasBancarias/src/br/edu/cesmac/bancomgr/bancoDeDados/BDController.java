package br.edu.cesmac.bancomgr.bancoDeDados;

import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Banco;
import br.edu.cesmac.bancomgr.sharedmodel.CategoriaCliente;
import br.edu.cesmac.bancomgr.sharedmodel.Cliente;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.TarifaTransacaoCliente;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

public class BDController implements IBD {

	private Banco banco;
	private List<Conta> contasDoBanco;
	//TODO adicionar outras listas
	
	
	@Override
	public List<Conta> obterContas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transacao> obterTransacoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void definirDadosBanco(Banco b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarConta(Conta c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarTransacao(Transacao t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarCategoriaCliente(CategoriaCliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarTarifaTransacaoCliente(TarifaTransacaoCliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarCliente(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirConta(Conta c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirTransacao(Transacao t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirCategoriaCliente(CategoriaCliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirTarifaTransacaoCliente(TarifaTransacaoCliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirCliente(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarConta(int numero, Conta c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarTransacao(int id, Transacao t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarCategoriaCliente(int id, CategoriaCliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarTarifaTransacaoCliente(int id, TarifaTransacaoCliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarCliente(int id, Cliente c) {
		// TODO Auto-generated method stub
		
	}

}
