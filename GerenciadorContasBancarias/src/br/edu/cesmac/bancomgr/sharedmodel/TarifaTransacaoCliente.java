package br.edu.cesmac.bancomgr.sharedmodel;


public class TarifaTransacaoCliente {
	private int id;
	protected float valor;
	
	private CategoriaCliente categoria;
	private Transacao transacao;
	
	
	public TarifaTransacaoCliente(int id, float valor, CategoriaCliente categoria, Transacao transacao) {
		this.id = id;
		this.valor = valor;
		this.categoria = categoria;
		this.transacao = transacao;
	}
	
	
	public int getId() {
		return id;
	}
	
	public float getValor() {
		return valor;
	}
	
	public CategoriaCliente getCategoria() {
		return categoria;
	}
	
	public Transacao getTransacao() {
		return transacao;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean out = false;
		
		if(obj instanceof TarifaTransacaoCliente) {
			if(((TarifaTransacaoCliente)obj).getId() == this.getId())
				out = true;
		}
		
		return out;
	}
}
