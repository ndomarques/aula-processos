package br.edu.cesmac.bancomgr.dialogo;

import br.edu.cesmac.bancomgr.sistema.contas.ContasController;
import br.edu.cesmac.bancomgr.sistema.contas.IConta;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConsultarSaldoUIController {
	public static final String VALOR_DO_SALDO = "Valor do Saldo: ";
	@FXML
	private TextField tfNumeroConta;
	@FXML
	private PasswordField pfSenha;
	@FXML
	private Label lValorSaldo;

	private IConta contaController;

	Stage stageWindow;

	public ConsultarSaldoUIController() {
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
		int numeroConta = Integer.parseInt(tfNumeroConta.getText());
		int senha = Integer.parseInt(pfSenha.getText());
		lValorSaldo.setText(VALOR_DO_SALDO + contaController.consultarSaldo(numeroConta, senha));
	}
}
