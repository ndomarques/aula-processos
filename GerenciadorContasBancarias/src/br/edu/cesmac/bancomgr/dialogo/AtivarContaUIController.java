package br.edu.cesmac.bancomgr.dialogo;

import javax.swing.JOptionPane;

import br.edu.cesmac.bancomgr.sistema.contas.ContasController;
import br.edu.cesmac.bancomgr.sistema.contas.IConta;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AtivarContaUIController {
	@FXML
	private TextField tfNumeroConta;	
	
	private IConta contaController;
	
	
	
	Stage stageWindow;
	
	
	public AtivarContaUIController() {
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
		int numero = new Integer(tfNumeroConta.getText()).intValue();	
		this.contaController.ativarConta(numero);
		JOptionPane.showMessageDialog(null, "Conta Ativada com sucesso!");
		fecharJanela();
	}

}
