package br.edu.cesmac.bancomgr.dialogo;

import br.edu.cesmac.bancomgr.sistema.contas.ContasController;
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
		ContasController contasController = new ContasController();
		int numero = new Integer(tfNumeroConta.getText());
		int senha = new Integer(pfSenha.getText());
		Float valor = new Float(tfValor.getText());
		contasController.sacar(numero, senha, valor);
	}

}
