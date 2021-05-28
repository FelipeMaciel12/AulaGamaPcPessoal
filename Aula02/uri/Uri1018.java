package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        int n100, n50, n20, n10, n5, n2, n1;
        int valorentrada;
        double valor;

        valorentrada=entrada.nextInt();

        valor=valorentrada;
        n100 = (int)valor/100;
        valor%=100;
        n50 = (int)valor/50;
        valor%=50;
        n20 = (int)valor/20;
        valor%=20;
        n10 = (int)valor/10;
        valor%=10;
        n5 = (int)valor/5;
        valor%=5;
        n2 = (int)valor/2;
        valor%=2;
        n1 = (int)valor/1;
        valor%=1;

        System.out.println(valorentrada);
        System.out.printf("%d nota(s) de R$ 100,00\n", n100);
        System.out.printf("%d nota(s) de R$ 50,00\n", n50);
        System.out.printf("%d nota(s) de R$ 20,00\n", n20);
        System.out.printf("%d nota(s) de R$ 10,00\n", n10);
        System.out.printf("%d nota(s) de R$ 5,00\n", n5);
        System.out.printf("%d nota(s) de R$ 2,00\n", n2);
        System.out.printf("%d nota(s) de R$ 1,00\n", n1);


        entrada.close();


    }
}
