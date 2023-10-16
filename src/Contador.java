
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = terminal.nextInt();

        

        try {
            contar(primeiroNumero, segundoNumero);
                
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo número deve ser maior do que o primeiro.");
        }

        terminal.close();
        
    }

     static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois)
                throw new ParametrosInvalidosException();


            int contagem = parametroDois - parametroUm;

            for (int iteracao=1; iteracao <= contagem; iteracao ++){
                System.out.println("Imprimindo o número " + iteracao);
            }

        }

    
}
