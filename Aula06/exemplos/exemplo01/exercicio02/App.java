package exemplos.exemplo01.exercicio02;

public class App {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Felipe", "19981964892");
        Estudante e = new Estudante ("Joao","1921211414","Agronomia");
        Professor prof = new Professor("Andre", "1930304040", 15000.00);

        System.out.println(p);
        System.out.println(e);
        System.out.println(prof);


    }
    
}
