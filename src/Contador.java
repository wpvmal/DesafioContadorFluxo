import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		try {
            System.out.println("Digite o primeiro parâmetro");
	    	int parametroUm = terminal.nextInt();
		    System.out.println("Digite o segundo parâmetro");
		    int parametroDois = terminal.nextInt();
			
            contar(parametroUm, parametroDois);
		}
        catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
        catch (InputMismatchException e){
            System.out.println("\nOs parâmetros devem ser números inteiros");
        }
        finally{
            terminal.close();
        }
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro");  
        }
		int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}