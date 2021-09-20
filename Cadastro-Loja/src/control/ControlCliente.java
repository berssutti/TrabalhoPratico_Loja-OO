package control;

import model.*;

public class ControlCliente {

	//private Dados dados = new Dados();
	private Cliente[] cliente;
	private int qtdClientes;

	/*
	 * public ControlCliente() { dados.addDados(); }
	 */
	public ControlCliente(ControlDados dados) {
		cliente = dados.getCliente();
		qtdClientes = dados.getQtdCliente();

	}

	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for (int i = 0; i < qtdClientes; i++) {
			s[i] = cliente[i].getNome();
		}

		return s;
	}

	/*
	 * // a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
	 * public boolean inserirEditarCliente(String[] dadosCliente) {
	 * if(!dadosCliente[2].matches("[0-9]+") || !dadosCliente[3].matches("[0-9]+")
	 * || !dadosCliente[4].matches("[0-9]+")) { return false; } else {
	 * 
	 * Aluno a = new Aluno(dadosCliente[1], dadosCliente[2],
	 * Integer.parseInt(dadosCliente[3]), Integer.parseInt(dadosCliente[4]), new
	 * Telefone(Integer.parseInt(dadosCliente[5]),
	 * Integer.parseInt(dadosCliente[6]))); d.inserirEditarAluno(a,
	 * Integer.parseInt(dadosCliente[0]));
	 * 
	 * return true; } }
	 * 
	 * public boolean removerCliente(int i) { String clienteRemovido =
	 * dados.getCliente()[i].getNome(); String aux;
	 * 
	 * if(i == (dados.getQtdClientes() - 1)) { // O aluno a ser removido est� no
	 * final do array dados.setQtdClientes(dados.getQtdClientes() - 1);
	 * dados.getCliente()[dados.getQtdClientes()] = null; return true; } else { // o
	 * aluno a ser removido est� no meio do array int cont = 0;
	 * while(dados.getCliente()[cont].getNome().compareTo(clienteRemovido) != 0) {
	 * cont++; } //Rotina swap for(int j = cont; j < dados.getQtdClientes() - 1;
	 * j++) { dados.getCliente()[j] = null; dados.getCliente()[j] =
	 * dados.getCliente()[j+1]; } dados.getCliente()[dados.getQtdClientes()] = null;
	 * dados.setQtdClientes(dados.getQtdClientes() - 1); return true; } }
	 */
	public int getQtd() {
		return qtdClientes;
	}

	public void setQtd(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

	public String getNome(int i) {
		return cliente[i].getNome();
	}

	public String getCPF(int i) {
		String numCPF = String.valueOf(cliente[i].getCpf());
		return numCPF;
	}

	public String getRG(int i) {
		String numRG = String.valueOf(cliente[i].getRg());
		return numRG;
	}

	public Telefone getTelefone(int i) {
		return cliente[i].getNumero();
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

	/*
	 * public Dados getDados() { return dados; } public void setDados(Dados dados) {
	 * this.dados = dados; }
	 * 
	 * public Cliente[] getCliente() { return this.dados.getCliente(); }
	 * 
	 * public int getQtdCliente() { return this.dados.getQtdClientes(); }
	 */

}
