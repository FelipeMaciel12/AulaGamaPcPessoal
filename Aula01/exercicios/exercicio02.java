package exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double not1, not2, media;
        System.out.print("Entre com a nota 01:");
        not1=entrada.nextDouble();
        System.out.print("Entre com a nota 02:");
        not2=entrada.nextDouble();
        media=(not1+not2)/2;
        System.out.print("A média aritmética: "+ media);
        entrada.close();
    }
}
