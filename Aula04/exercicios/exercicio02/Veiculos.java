package exercicios.exercicio02;

public class Veiculos {
    // inserir atributos
    String marca, modelo;
    double consumo;


    // inserir metodos
    Veiculos(String marca, String modelo, double consumo) {

        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;

    }

    void apresentar() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);

    }

    double retorno() {
        return consumo;
    }
}
