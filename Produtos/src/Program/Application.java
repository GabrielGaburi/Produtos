package Program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Produto;
import Entities.produtoImportado;
import Entities.produtoUsado;

public class Application {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos registrados: \n");
		int num = leia.nextInt();
		
		for(int i = 1; i <= num; i++ ) {
			
			System.out.print("Dados do produto " + i + ": \n");
			System.out.print("Novo, usado, importado (n/u/i)?  \n");
			char tipo = leia.next().charAt(0);
			leia.nextLine();
			System.out.print(" Nome:  \n");
			String nome = leia.nextLine();
			System.out.print(" Preço: \n");
			Double preco = leia.nextDouble();
			
			
			if (tipo == 'n' ) {
				lista.add(new Produto(nome, preco));
			}
			else if (tipo == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): \n");
				LocalDate date = LocalDate.parse(leia.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				lista.add(new produtoUsado(nome, preco, date));
			}
			
			else if( tipo == 'i') {
				System.out.print("Taxa de importacao: \n");
				double custoAdicional = leia.nextDouble();
				lista.add(new produtoImportado(nome, preco, custoAdicional));
			}
			
		}
			System.out.println();
			System.out.println("ETIQUETAS DE PRECO:");
			for (Produto prod : lista) {
				System.out.println(prod.etiquetaPreco());
			}
			
			leia.close();
			
			
		}
	 

	}


