package br.edu.cesmac.bancomgr.dialogo;

import javax.swing.JOptionPane;

import br.edu.cesmac.bancomgr.sistema.contas.ContasController;
import br.edu.cesmac.bancomgr.sistema.contas.IConta;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CriarContaCorrenteUIController {
	@FXML
	private TextField tfNumeroConta;
	@FXML
	private PasswordField pfSenha;
	@FXML
	private TextField tfLimite;
	@FXML
	private TextField tfTxJuros;
	
	
	
	private IConta contaController;
	
	
	
	Stage stageWindow;
	
	
	public CriarContaCorrenteUIController() {
		this.contaController = new ContasController();
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
		//obterDados da interface
		int numero = new Integer(tfNumeroConta.getText()).intValue();
		int senha = new Integer(pfSenha.getText());
		int limite = new Integer(tfLimite.getText());
		float taxaJuros = new Float(tfTxJuros.getText());
		this.contaController.criarContaCorrente(numero, senha, limite, taxaJuros);
		JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
		fecharJanela();
	}

}
