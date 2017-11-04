package br.edu.cesmac.bancomgr.dialogo;

import javax.swing.JOptionPane;

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
		String numeroText = tfNumeroConta.getText();
		String valorText = tfValor.getText();
		
		if ((numeroText == null || numeroText.trim().isEmpty()) ||
				(valorText == null || valorText.trim().isEmpty())) {
			JOptionPane.showMessageDialog(null, "Por favor preencha os campos!");
			return;
		}
		
		int numero = new Integer(numeroText);
		float valor = new Float(valorText);
		movimentacaoController.depositar(numero, valor);
	}

}
