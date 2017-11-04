package br.edu.cesmac.bancomgr.dialogo;

import javax.swing.JOptionPane;
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
		String numeroText = tfNumeroConta.getText();
		String valorText = tfValor.getText();
		String senhaText = pfSenha.getText();
		
		if ((numeroText == null || numeroText.trim().isEmpty()) ||
				(valorText == null || valorText.trim().isEmpty()) ||
				(senhaText == null || senhaText.trim().isEmpty())) {
			JOptionPane.showMessageDialog(null, "Por favor preencha os campos!");
			return;
		}
		
		ContasController contasController = new ContasController();
		int numero = new Integer(numeroText);
		int senha = new Integer(senhaText);
		Float valor = new Float(valorText);
		contasController.sacar(numero, senha, valor);
	}

}
