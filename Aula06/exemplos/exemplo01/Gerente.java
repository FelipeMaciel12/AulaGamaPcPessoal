package exemplos.exemplo01;

public class Gerente extends Funcionario {
    
    private int nfunc;

    public Gerente (String nome, double salario, int nfunc){
        super(nome, salario); // PRIMEIRO: chamada ao construtor da super classe Funcionario
        this.nfunc=nfunc;
    }

    @Override
    public String imprimir() {
        return super.imprimir()+ " : "+nfunc;
    }

    @Override    
    public void calculaSalario(double perc){
        super.calculaSalario(perc + 0.2);
    }
    
    @Override
    public String toString() {
    
    return super.toString()+ " : "+nfunc;
}

}
