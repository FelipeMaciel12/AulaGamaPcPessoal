package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        int a,b,c,d;
        a=entrada.nextInt();
        b=entrada.nextInt();
        c=entrada.nextInt();
        d=entrada.nextInt();

        if (b>c && d>a && c+d>a+b && c>=0 && d>=0 && a%2==0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }

        entrada.close();

    }
}
