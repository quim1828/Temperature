package application;
import java.util.Scanner;

public class estoque_medio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	double quantidade_minima, quantidade_maxima,estoque_medio;
	
	System.out.print("Calculadora de Estoque M�dio\n\n");
	
	System.out.print("Digite a quantidade m�mima:");
	quantidade_minima = entrada.nextDouble();
	
	System.out.print("Digite a quantidade m�xima:");
	quantidade_maxima = entrada.nextDouble();
	estoque_medio = (quantidade_minima + quantidade_maxima ) / 2;
	
	if (estoque_medio < 30) {
		System.out.print("Estoque M�dio = "+estoque_medio+"\n");
		
	}else {
		System.out.println("O valor n�o pode ser maior que 30.");
	}
	
    }

}