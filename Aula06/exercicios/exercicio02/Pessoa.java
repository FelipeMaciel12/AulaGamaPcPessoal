package exercicios.exercicio02;

public class Pessoa {
    
    private String name, tel;

    public Pessoa(String name, String tel){
        this.name=name;
        this.tel=tel;

    }

    @Override
    public String toString() {
        return name+ " : " + tel;
    }
}
