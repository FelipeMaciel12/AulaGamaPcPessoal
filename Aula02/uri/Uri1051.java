package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double salario, imposto;

        salario=entrada.nextDouble();

        if (salario>=0 && salario<=2000.00){
            System.out.println("Isento");
        }
        else{
            if(salario>=2000.01 && salario<=3000.00){
                imposto=(salario-2000.00)*0.08;
                System.out.printf("R$ %.2f\n",imposto);
            }
            else{
                if(salario>=3000.01 && salario<=4500.00){
                imposto=(salario-3000.00)*0.18+(3000.00-2000.01)*0.08;
                System.out.printf("R$ %.2f\n",imposto);    
                }
                else{
                    if(salario>4500.00){
                    imposto=(salario-4500.00)*0.28+(4500.00-3000.01)*0.18+(3000.00-2000.01)*0.08;    
                    System.out.printf("R$ %.2f\n",imposto);
                    }
                    
                }
                
            }

        }
        entrada.close();
    }
}
