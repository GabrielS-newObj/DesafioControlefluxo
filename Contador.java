
import java.util.Scanner;
 
public class Contador {
 
    public static void main(String[] args) {
 
        try (Scanner terminal = new Scanner(System.in)) {
 
            int parametroUm = Integer.parseInt(terminal.nextLine());
            int parametroDois = Integer.parseInt(terminal.nextLine());
 
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
 
        } catch (NumberFormatException nfe) {
            System.out.println("Devem ser números inteiros!\n\n");
 
        } catch (ParametrosInvalidosException pie) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(pie.getMessage());
            System.out.print("\n\n");
        }
    }
 
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
 
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int contagem = parametroDois - parametroUm;
 
        if (contagem <= 0) {
            throw new ParametrosInvalidosException();
        }
 
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Contagem atual: " + i);
        }
    }
}
 

