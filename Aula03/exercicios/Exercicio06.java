package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, par, impar;
        par = 0;
        impar = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º numero: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("O total de pares é: " + par + "\nO total de impares é: " + impar);
        entrada.close();
    }
}
