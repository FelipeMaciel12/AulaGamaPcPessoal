package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        final int totalnumero = 6;
        double numero, media;
        int qtde;
        qtde = 0;
        media = 0;

        for (int i = 1; i <= totalnumero; i++) {
            System.out.print("Insira o numero: ");
            numero = teclado.nextDouble();
            if (numero >= 0) {
                qtde++;
                media = media + numero;
            }

        }

        media = media / qtde;
        System.out.println(qtde + " valores positivos");
        System.out.printf("%.1f\n", media);
        teclado.close();

    }
}
