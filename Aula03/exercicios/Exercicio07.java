package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, ipar;
        double medpar, iimpar;
        medpar = 0;
        ipar = 0;
        iimpar = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º numero: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                medpar = medpar + numero;
                ipar++;
            } else {
                iimpar++;
            }
        }
        medpar = medpar / ipar;
        iimpar = (iimpar / 10) * 100;
        System.out.printf("A media de valores pares é: %.2f ", medpar);
        System.out.printf("\nA porcentagem de impares é: %.2f%s ", iimpar,"%");
        entrada.close();
    }
}
