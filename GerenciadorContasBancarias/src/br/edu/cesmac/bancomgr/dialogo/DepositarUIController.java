package br.edu.cesmac.bancomgr.dialogo;

import br.edu.cesmac.bancomgr.sistema.movimentacao.IMovimentacao;
import br.edu.cesmac.bancomgr.sistema.movimentacao.MovimentacaoController;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DepositarUIController {
	@FXML
	private TextField tfNumeroConta;
	@FXML
	private TextField tfValor;
	
	
	private IMovimentacao movimentacaoController;
	
	Stage stageWindow;
	
	
	public DepositarUIController() {
		this.movimentacaoController = new MovimentacaoController();
	}
	
	
	public void setStageWindow(Stage stage) {
		this.stageWindow = stage;
	}
	
	
	@FXML
	public void fecharJanela() {
		this.stageWindow.close();
	}
	
	@FXML
	public void ok() {
		//TODO implementar
	}

}
