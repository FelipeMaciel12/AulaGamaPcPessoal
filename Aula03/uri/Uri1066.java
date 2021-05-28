package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        final int totalnumero = 5;
        int numero;
        int par, imp, pos, neg;
        par = 0;
        imp = 0;
        pos = 0;
        neg = 0;

        for (int i = 1; i <= totalnumero; i++) {
            // System.out.print("Insira o numero: ");
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                par++;
            } else {
                imp++;
            }
            if (numero > 0) {
                pos++;
            } else {
                if (numero < 0) {
                    neg++;
                }

            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(imp + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");

        teclado.close();

    }
}
