package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double media, mediaaluno, mediaturma, mediageral;
        mediaaluno = 0;
        mediaturma = 0;
        mediageral = 0;
        final int qaluno = 5;
        final int qturma = 5;
        for (int i = 1; i <= qturma; i++) {
            mediaaluno = 0;
            for (int j = 1; j <= qaluno; j++) {
                System.out.print("Insira a Media do Aluno: ");
                media = teclado.nextDouble();
                mediaaluno = mediaaluno + media;
            }
            mediaturma = mediaaluno / qaluno;
            System.out.println("Media da turma " + i + " : " + mediaturma);
            mediageral = mediageral + mediaturma;
        }

        mediageral = mediageral / qturma;
        System.out.println("Media geral:" + mediageral);

        teclado.close();
    }
}
