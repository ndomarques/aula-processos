package br.edu.cesmac.bancomgr.dialogo;

import br.edu.cesmac.bancomgr.sistema.movimentacao.IMovimentacao;
import br.edu.cesmac.bancomgr.sistema.movimentacao.MovimentacaoController;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SacarUIController {
	@FXML
	private TextField tfNumeroConta;
	@FXML
	private PasswordField pfSenha;
	@FXML
	private TextField tfValor;
	
	
	private IMovimentacao movimentacaoController;
	
	
	
	Stage stageWindow;
	
	
	
	public SacarUIController() {
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
