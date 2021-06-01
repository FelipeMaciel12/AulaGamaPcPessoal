package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        
        Conta c = new Conta(1866, 2, 200.00);
        ContaCorrente c2 = new ContaCorrente(1866, 2, 300.00);
        ContaEspecial c3 = new ContaEspecial(1866, 2, 400.00);
        //System.out.println(c);
        System.out.println(c3);
        if (c3.deposito(150.00)) {
            System.out.println("OPERAÇÃO REALIZADA");
        } else{
            System.out.println("FALHA NA OPERAÇÃO");
        }

        if (c3.saque(1000.00)) {
            System.out.println("OPERAÇÃO REALIZADA");
        } else{
            System.out.println("FALHA NA OPERAÇÃO");
        }
                  
        System.out.println(c3);
    }
}
