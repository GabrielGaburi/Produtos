package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class produtoUsado extends Produto{
	
	private LocalDate dataFabricacao;
	
	public produtoUsado() {
		
	}

	public produtoUsado(String nome, Double preco, LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	public String etiquetaPreco() {
		
		return getNome() + ": R$" + String.format("%.2f", getPreco()) + ", Data de Fabricação: " + dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
	}
	
	

}
