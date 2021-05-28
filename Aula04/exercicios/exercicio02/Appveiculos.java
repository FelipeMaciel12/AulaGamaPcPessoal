package exercicios.exercicio02;

import java.util.Scanner;

public class Appveiculos {
    public static void main(String[] args) {
        String m, mod;
        double cons;
        Scanner teclado = new Scanner(System.in);
        m = teclado.next();
        mod = teclado.next();
        cons = teclado.nextDouble();
        Veiculos v = new Veiculos(m,mod,cons);
        v.apresentar();
        System.out.println("O Valor do Consumo: " + v.retorno() + " Km/l");
        teclado.close();
    }
}
