package br.edu.cesmac.bancomgr.sistema.contas;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.cesmac.bancomgr.bancoDeDados.BDController;
import br.edu.cesmac.bancomgr.bancoDeDados.IBD;
import br.edu.cesmac.bancomgr.sharedmodel.Banco;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Corrente;
import br.edu.cesmac.bancomgr.sharedmodel.Poupanca;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

public class ContasController implements IConta {
	private IBD bancoDados;
	public static final float SALDO_INICIAL_ABERTURA_DE_CONTA = 0;
	public static final int STATUS_ATIVA = 1;
	public static final int STATUS_INATIVA = 2;

	public ContasController() {
		this.bancoDados = BDController.createInstance();
	}

	@Override
	public int criarContaPoupanca(int numero, int senha, int diaAniversario,
			float taxaRendimento) {
		Banco banco = this.bancoDados.obterBanco();
		Poupanca p = new Poupanca(numero, 0, senha, banco, diaAniversario,
				taxaRendimento);
		this.bancoDados.adicionarConta(p);
		return 1;
	}

	@Override
	public int criarContaCorrente(int numero, int senha, float limite,
			float taxaJuros) {
		Banco banco = this.bancoDados.obterBanco();
		Corrente c = new Corrente(numero, SALDO_INICIAL_ABERTURA_DE_CONTA,
				senha, banco, limite, taxaJuros);
		this.bancoDados.adicionarConta(c);
		return 1;
	}

	@Override
	public int desativarConta(int numero) {

		Conta conta = this.bancoDados
				.getContaPassandoNumeroComoParametro(numero);
		if (conta != null) {
			if (conta.getStatus() == STATUS_ATIVA) {
				conta.setStatus(STATUS_INATIVA);
				this.bancoDados.alterarConta(numero, conta);
				JOptionPane.showMessageDialog(null, "Conta " + numero
						+ " desativada.");
			} else {
				JOptionPane.showMessageDialog(null, "Conta " + numero
						+ " já se encontra desativada.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Conta " + numero
					+ " inexistente.");

		}
		return 1;

	}

	@Override
	public int ativarConta(int numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float consultarSaldo(int numeroConta, int senha) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Transacao> obterExtrato(int numeroConta, int senha,
			Date dataInicio, Date dataFim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transacao> obterExtrato(int numeroConta, int senha) {
		// TODO Auto-generated method stub
		return null;
	}

}
