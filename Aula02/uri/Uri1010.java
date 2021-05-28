package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int p1, n1, p2, n2;
        double v1, v2, total;

        p1=entrada.nextInt();
        n1=entrada.nextInt();
        v1=entrada.nextDouble();

        p2=entrada.nextInt();
        n2=entrada.nextInt();
        v2=entrada.nextDouble();

        total= ((n1*v1)+(n2*v2));
        System.out.print("Codigos Cadastrados: \n"+p1+"\n"+p2+"\n");
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        System.out.println();

        entrada.close();




    }
}
