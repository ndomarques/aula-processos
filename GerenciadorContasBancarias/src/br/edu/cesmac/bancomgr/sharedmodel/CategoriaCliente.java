package br.edu.cesmac.bancomgr.sharedmodel;

import java.util.ArrayList;
import java.util.List;

public class CategoriaCliente {
	private int id;
	private String nome;
	
	private List<Cliente> clientes;
	private List<TarifaTransacaoCliente> tarifas;
	
	
	public CategoriaCliente(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.clientes = new ArrayList<>();
		this.tarifas = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}
		
	public String getNome() {
		return nome;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public List<TarifaTransacaoCliente> getTarifas() {
		return tarifas;
	}
	
	public void addCliente(Cliente c) {
		if(!this.clientes.contains(c))
			this.clientes.add(c);
	}
	
	public void addTarifa(TarifaTransacaoCliente t) {
		if(!this.tarifas.contains(t))
			this.tarifas.add(t);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean out = false;
		
		if(obj instanceof CategoriaCliente) {
			if(((CategoriaCliente)obj).getId() == this.getId())
				out = true;
		}
		
		return out;
	}
}
