package br.edu.cesmac.bancomgr.sharedmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Transacao {
	private int id;
	private String nome;
	protected float valor;
	private Date data;
	
	private List<TarifaTransacaoCliente> tarifas;
	
	
	public Transacao(int id, String nome, float valor, Date data) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.data = data;
		this.tarifas = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getValor() {
		return valor;
	}
	
	public Date getData() {
		return data;
	}
	
	public List<TarifaTransacaoCliente> getTarifas() {
		return tarifas;
	}
	
	public void addTarifa(TarifaTransacaoCliente t) {
		if(!this.tarifas.contains(t))
			this.tarifas.add(t);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean out = false;
		
		if(obj instanceof Transacao) {
			if(((Transacao)obj).getId() == this.getId())
				out = true;
		}
		
		return out;
	}
}
