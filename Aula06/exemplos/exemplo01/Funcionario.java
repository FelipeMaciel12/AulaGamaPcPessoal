package exemplos.exemplo01;

/**
 * Funcionario
 */
public class Funcionario {

    private String nome;
    private double salario;

public Funcionario(String nome){
    this.nome=nome;

}

// overload polimorfismo chamar o mesmo construtor de diferentes formas
public Funcionario(String nome, double salario){//construtor
this.nome=nome;
this.salario=salario;

}

public String imprimir (){
    return nome + " : " + salario;
}

public void  calculaSalario(double perc){
    salario=salario +(salario*perc);
}
    
}