package br.edu.cesmac.bancomgr.bancoDeDados;

import java.util.ArrayList;
import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Banco;
import br.edu.cesmac.bancomgr.sharedmodel.CategoriaCliente;
import br.edu.cesmac.bancomgr.sharedmodel.Cliente;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.TarifaTransacaoCliente;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

public class BDController implements IBD {
	
	//singleton
	private static BDController bdcontroller;

	private Banco banco;
	private List<Conta> listaContasDoBanco;
	private List<Transacao> listaTransacoes;
	private List<CategoriaCliente> listaCategoriasDeClientes;
	private List<TarifaTransacaoCliente> listaTarifasPorCategoriasClientes;
	private List<Cliente> listaClientes;
	
	private BDController() {
		this.listaContasDoBanco = new ArrayList<>();
		this.listaTransacoes = new ArrayList<>();
		this.listaCategoriasDeClientes = new ArrayList<>();
		this.listaTarifasPorCategoriasClientes = new ArrayList<>();
		this.listaClientes = new ArrayList<>();
	}
	
	public static BDController createInstance() {
		if (bdcontroller==null)
			bdcontroller = new BDController();
		return bdcontroller;
	}
	
	
	
	@Override
	public synchronized List<Conta> obterContas() {
		return this.listaContasDoBanco;
	}

	@Override
	public synchronized List<Transacao> obterTransacoes() {
		return this.listaTransacoes;
	}
	
	public synchronized Banco obterBanco() {
		return this.banco;
	};

	@Override
	public synchronized void definirDadosBanco(Banco b) {
		this.banco = b;
	}

	@Override
	public synchronized void adicionarConta(Conta c) {
		if(!this.listaContasDoBanco.contains(c))
				this.listaContasDoBanco.add(c);
	}

	@Override
	public synchronized void adicionarTransacao(Transacao t) {
		if(!this.listaTransacoes.contains(t))
			this.listaTransacoes.add(t);
	}

	@Override
	public synchronized void adicionarCategoriaCliente(CategoriaCliente c) {
		if(!this.listaCategoriasDeClientes.contains(c))
			this.listaCategoriasDeClientes.add(c);
	}

	@Override
	public synchronized void adicionarTarifaTransacaoCliente(TarifaTransacaoCliente ttc) {
		if(!this.listaTarifasPorCategoriasClientes.contains(ttc))
			this.listaTarifasPorCategoriasClientes.add(ttc);
	}

	@Override
	public synchronized void adicionarCliente(Cliente c) {
		if(!this.listaClientes.contains(c))
			this.listaClientes.add(c);
	}

	@Override
	public synchronized void excluirConta(Conta c) {
		if(this.listaContasDoBanco.contains(c))
			this.listaContasDoBanco.remove(c);
	}

	@Override
	public synchronized void excluirTransacao(Transacao t) {
		if(this.listaTransacoes.contains(t))
			this.listaTransacoes.remove(t);
	}

	@Override
	public synchronized void excluirCategoriaCliente(CategoriaCliente c) {
		if(this.listaCategoriasDeClientes.contains(c))
			this.listaCategoriasDeClientes.remove(c);
	}

	@Override
	public synchronized void excluirTarifaTransacaoCliente(TarifaTransacaoCliente ttc) {
		if(this.listaTarifasPorCategoriasClientes.contains(ttc))
			this.listaTarifasPorCategoriasClientes.remove(ttc);
	}

	@Override
	public synchronized void excluirCliente(Cliente c) {
		if(this.listaClientes.contains(c))
			this.listaClientes.remove(c);
	}

	@Override
	public synchronized void alterarConta(int numero, Conta c) {
		for(Conta ctAtual : this.listaContasDoBanco) {
			if(ctAtual.getNumero()==numero) {
				this.excluirConta(ctAtual);
				this.adicionarConta(c);
				break;
			}
		}
	}

	@Override
	public synchronized void alterarTransacao(int id, Transacao t) {
		for(Transacao tAtual : this.listaTransacoes) {
			if(tAtual.getId()==id) {
				this.excluirTransacao(tAtual);
				this.adicionarTransacao(t);
				break;
			}
		}
	}

	@Override
	public synchronized void alterarCategoriaCliente(int id, CategoriaCliente c) {
		for(CategoriaCliente ccAtual : this.listaCategoriasDeClientes) {
			if(ccAtual.getId()==id) {
				this.excluirCategoriaCliente(ccAtual);
				this.adicionarCategoriaCliente(c);
				break;
			}
		}
	}

	@Override
	public synchronized void alterarTarifaTransacaoCliente(int id, TarifaTransacaoCliente ttc) {
		for(TarifaTransacaoCliente ttcAtual : this.listaTarifasPorCategoriasClientes) {
			if(ttcAtual.getId()==id) {
				this.excluirTarifaTransacaoCliente(ttcAtual);
				this.adicionarTarifaTransacaoCliente(ttc);
				break;
			}
		}
	}

	@Override
	public synchronized void alterarCliente(int id, Cliente c) {
		for(Cliente cAtual : this.listaClientes) {
			if(cAtual.getId()==id) {
				this.excluirCliente(cAtual);
				this.adicionarCliente(c);
				break;
			}
		}
	}
	
	public Conta getContaPassandoNumeroComoParametro(int numero) {
			
			for (int i = 0; i < listaContasDoBanco.size(); i++) {
			if (listaContasDoBanco.get(i).getNumero() == numero) {
				return listaContasDoBanco.get(i);

			
			}
		}
		return null;
	}
}
