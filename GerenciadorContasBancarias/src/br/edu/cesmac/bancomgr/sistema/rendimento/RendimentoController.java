package br.edu.cesmac.bancomgr.sistema.rendimento;

import br.edu.cesmac.bancomgr.bancoDeDados.BDController;
import br.edu.cesmac.bancomgr.bancoDeDados.IBD;

public class RendimentoController implements IRendimento{
private IBD bancoDados;
	
	public RendimentoController() {
		this.bancoDados = BDController.createInstance();
	}

	@Override
	public void aplicarRendimento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cobrarJuros() {
		// TODO Auto-generated method stub
		
	}

}
