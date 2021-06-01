package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        
        Funcionario func = new Funcionario("Felipe",1000.00);
        Funcionario func2 = new Funcionario("Felipe");
        Gerente ger = new Gerente ("Arnaldo",1000.00,10);


        //polimorfismo: mesmo metodo com corpotamento interno diferente
        func.calculaSalario(0.1);
        func2.calculaSalario(0.1);
        ger.calculaSalario(0.1);
        
        System.out.println(func.imprimir());
        System.out.println(func2.imprimir());
        System.out.println(ger.imprimir());

        System.out.println(func);
        System.out.println(ger);

    }
}
