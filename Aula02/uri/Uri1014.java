package uri;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        int x;
        double y, valor;

        x=entrada.nextInt();
        y=entrada.nextDouble();

        valor=x/y;

        System.out.printf("%.3f", valor);
        System.out.print(" km/l");
        System.out.println();

        entrada.close();

    }
}
