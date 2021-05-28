package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        double n1, n2, n3, media;

        n1=entrada.nextDouble();
        n2=entrada.nextDouble();
        n3=entrada.nextDouble();

        media=((n1*2)+(n2*3)+(n3*5))/10;
        
        System.out.printf("MEDIA = %.1f", media);
        System.out.println();

        entrada.close();

    }
}
