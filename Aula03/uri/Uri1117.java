package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double not1, not2, media;

        not1 = teclado.nextDouble();

        while (not1 < 0 || not1 > 10) {
            System.out.println("nota invalida");
            not1 = teclado.nextDouble();
        }

        not2 = teclado.nextDouble();

        while (not2 < 0 || not2 > 10) {
            System.out.println("nota invalida");
            not2 = teclado.nextDouble();
        }

        media = (not1 + not2) / 2;
        System.out.printf("media = %.2f\n", media);

        teclado.close();
    }
}
