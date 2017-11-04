package br.edu.cesmac.bancomgr.sistema.rendimento;

import java.util.List;
import br.edu.cesmac.bancomgr.bancoDeDados.BDController;
import br.edu.cesmac.bancomgr.bancoDeDados.IBD;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Corrente;
import br.edu.cesmac.bancomgr.sharedmodel.Poupanca;

public class RendimentoController implements IRendimento{
	private IBD bancoDados;
	
	public RendimentoController() {
		this.bancoDados = BDController.createInstance();
	}
	
	/** O juro só funciona com entrada do juros normalizado
	 exemplo: colocar entrada de 10% de juros como 1,1 
	 @author Alesson
	 @author Adson
	 @author Angelo
	 @author Alisson
	 */
	@Override
	public void aplicarRendimento() {
		List<Conta> contas = bancoDados.obterContas();		
		for (Conta conta : contas) {
			if (conta instanceof Poupanca) {
				((Poupanca) conta).aplicarRendimento();
			}
		} 		
	}

	@Override
	/** O juro só funciona com entrada do juros normalizado
	 exemplo: colocar entrada de 10% de juros como 1,1 
	 @author Alesson
	 @author Adson
	 @author Angelo
	 @author Alisson
	 */
	public void cobrarJuros() {
		List<Conta> contas = bancoDados.obterContas();
		for (Conta conta : contas) {
			if (conta instanceof Corrente && conta.isSaldoNegativo()) {
				((Corrente) conta).aplicarJuros();
			}	
		}		
	}

}
