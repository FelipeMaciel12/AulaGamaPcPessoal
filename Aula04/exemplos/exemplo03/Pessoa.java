package exemplos.exemplo03;

public class Pessoa {
    //atributos declarados na classe 
    String nome;
    int telefone;
    //metodos
    
    Pessoa(String n, int t){// construtor
        nome=n;
        telefone=t;

    }
    
    void apresentar(){
        System.out.println("Olá! Eu sou "+ nome);
    }

    int telefone(){
        return telefone;
    }
}
