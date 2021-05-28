package exercicios;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        
            Scanner entrada = new Scanner (System.in);
            double sal;
            System.out.print("Entre com o salario atual:");
            sal=entrada.nextDouble();
            sal=sal+(sal*0.25);
            System.out.print("Salario apos reajuste: "+ sal);
            entrada.close();
        }
}
