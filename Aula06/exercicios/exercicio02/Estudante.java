package exercicios.exercicio02;

public class Estudante extends Pessoa {
    
    private String curso;

    public Estudante (String name, String tel, String curso){
    
        super(name, tel);
        this.curso=curso;

    }

    @Override
    public String toString() {
        return super.toString()+ " : " +curso;
    }

}
