package br.edu.cesmac.bancomgr.dialogo;

import java.util.List;

import javax.swing.JOptionPane;

import br.edu.cesmac.bancomgr.sharedmodel.Transacao;
import br.edu.cesmac.bancomgr.sistema.contas.ContasController;
import br.edu.cesmac.bancomgr.sistema.contas.IConta;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ObterExtratoGeralUIController {
	@FXML
	private TextField tfNumeroConta;
	@FXML
	private PasswordField pfSenha;
	
	private IConta contaController;
	
	private ContasController ccont;
	
	int conta = Integer.parseInt(tfNumeroConta.getText());
	int senha = Integer.parseInt(pfSenha.getText());
	
	Stage stageWindow;
	
	
	public ObterExtratoGeralUIController() {
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
		
		 List<Transacao> listaMinhasTransacoesOk;
		 String dadosSaida = "";
		
		 listaMinhasTransacoesOk = ccont.obterExtrato(conta, senha);
		 for (int i = 0; i<listaMinhasTransacoesOk.size(); i++){
			 dadosSaida += "- "+listaMinhasTransacoesOk.get(i)+"\n";
		 }
		 
		JOptionPane.showMessageDialog(null, dadosSaida);
		
	}

}
