package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Estrutura para Leitura de dados do teclado
        System.out.println(entrada);

        int numero, dobro;
        System.out.print("Entre com o numero inteiro:");
        numero = entrada.nextInt(); // Atribuindo entrada a variável numero
        dobro=numero*2;
        System.out.println("O numero digitado foi:" + numero); // Imprimindo a entrada
        System.out.println("O dobro calculado foi:" + dobro); // Imprimindo o resultado

        entrada.close();

    }
}
