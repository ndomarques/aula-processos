package br.edu.cesmac.bancomgr.sistema.movimentacao;

public interface IMovimentacao {

	public void sacar(int numeroConta, int senha, float valor);
	public void depositar(int numeroConta, float valor);
	public void transferir(int numeroContaOrigem, int senha, float valor, int numeroContaDestino);
	
}
