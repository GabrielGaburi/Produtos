package Entities;

public class produtoImportado extends Produto {
	
	private double custoAdicional;
	
	public produtoImportado() {
		
	}

	public produtoImportado(String nome, Double preco, double custoAdicional) {
		super(nome, preco);
		this.custoAdicional = custoAdicional;
	}

	public double getCustoAdicional() {
		return custoAdicional;
	}
	
	public double totalPreco() {
		return preco + custoAdicional;
	}

	public String etiquetaPreco() {
		
		return getNome() + ": R$" + String.format("%.2f", totalPreco()) + ", Custo Adicional: R$" + String.format("%.2f", custoAdicional);
			
	}
	
	
	
	
	
	
	
}
