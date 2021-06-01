package exemplos.exemplo01.exercicio02;

public class Professor extends Pessoa {

    private double sal;
    
    public Professor (String name, String tel, double sal){
        super(name, tel);
        this.sal=sal;
    }

    @Override
    public String toString() {
        
        return super.toString()+ " : "+sal;
    }
}
