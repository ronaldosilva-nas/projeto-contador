import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = scan.nextInt();
		
        System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = scan.nextInt();

        scan.close();

        try {

        // Lança exceção se os parâmetros forem inválidos
        if(parametroUm > parametroDois)
        throw new ParametrosInvalidosException();
        
        contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        for(int contagem = 1; contagem <= (parametroDois - parametroUm); contagem++){
            System.out.println("Imprimindo o número: " + contagem);
        }
    }
}
