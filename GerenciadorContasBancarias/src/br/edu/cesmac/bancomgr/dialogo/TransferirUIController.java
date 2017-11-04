package br.edu.cesmac.bancomgr.dialogo;

import br.edu.cesmac.bancomgr.sistema.movimentacao.IMovimentacao;
import br.edu.cesmac.bancomgr.sistema.movimentacao.MovimentacaoController;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class TransferirUIController {

	@FXML
	private TextField tfNumeroContaOrigem;
	@FXML
	private PasswordField pfSenha;
	@FXML
	private TextField tfValor;
	@FXML
	private TextField tfNumeroContaDestino;
	
	private IMovimentacao movimentacaoController;

	Stage stageWindow;

	public TransferirUIController() {
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
		int numeroContaOrigem = Integer.parseInt(tfNumeroContaOrigem.getText());
		int numeroContaDestino = Integer.parseInt(tfNumeroContaDestino.getText());
		float valor = Float.parseFloat(tfValor.getText());
		int senha = Integer.parseInt(pfSenha.getText());
		movimentacaoController.transferir(numeroContaOrigem, senha, valor, numeroContaDestino);
		JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!");
	}

}
