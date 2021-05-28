package exemplos;

import java.util.Scanner;

class Exemplo01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tamanho;
        tamanho = entrada.nextInt();
        System.out.println("Aplicação v0.1");
        linha();
        System.out.println("Menu");
        linha2(tamanho);
        linha3(tamanho, '*');
        entrada.close();
    }

    static void linha() { //metodo void não devolve nada apenas executa o conteúdo

        System.out.println("----------------");

    }

    static void linha2(int tamanho) { //metodo void não devolve nada apenas executa o conteúdo
        for (int i = 1; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha3 (int tamanho, char simbolo) { //metodo void não devolve nada apenas executa o conteúdo
        for (int i = 1; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

}