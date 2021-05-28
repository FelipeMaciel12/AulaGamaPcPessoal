package exemplos.exemplo03;

public class Apppessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Felipe",1981964892);
        p.apresentar();
        System.out.println("Meu telefone é: "+p.telefone);
    }
}
