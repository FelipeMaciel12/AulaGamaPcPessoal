package exemplos.exemplo01;

/**
 * Funcionario
 */

 // Por herança todo mundo vem do extends Object (Classe base de objetos no Java)
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

@Override
public String toString() {
    
    return nome + " : " + salario;
}

}