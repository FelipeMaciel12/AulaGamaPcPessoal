package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double a, b, c;

        System.out.print("Entre com o tamanho do Lado A:");
        a = entrada.nextDouble();
        System.out.print("Entre com o tamanho do Lado B:");
        b = entrada.nextDouble();
        System.out.print("Entre com o tamanho do Lado C:");
        c = entrada.nextDouble();

        if (a > b + c || b > c + a || c > a + b) {
            System.out.println("NÃO É TRIANGULO");
        } else {
            if (a == b && b == c) {
                System.out.println("É UM TRIANGULO EQUILÁTERO");
            } else {
                if (a == b || b == c || c == a) {
                    System.out.println("É UM TRIANGULO ISÓSCELES");
                } else {
                    System.out.println("É UM TRIANGULO ESCALENO");
                }
            }

        }

        entrada.close();
    }
}
