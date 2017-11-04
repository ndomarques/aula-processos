package br.edu.cesmac.bancomgr.dialogo;

import br.edu.cesmac.bancomgr.sistema.contas.ContasController;
import br.edu.cesmac.bancomgr.sistema.contas.IConta;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ObterExtratoPeriodoUIController {
	@FXML
	private TextField tfNumeroConta;
	@FXML
	private PasswordField pfSenha;
	@FXML
	private DatePicker dpDataInicio;
	@FXML
	private DatePicker dpDataFim;
	
	
	private IConta contaController;
	
	
	
	Stage stageWindow;
	
	
	public ObterExtratoPeriodoUIController() {
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
		//TODO implementar
	}

}
