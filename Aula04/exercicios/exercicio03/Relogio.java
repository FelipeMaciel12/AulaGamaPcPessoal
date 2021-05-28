package exercicios.exercicio03;

public class Relogio {
    // inserir atriutos
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {

        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {

        if (hora > 0 && hora < 24) {
            this.hora = hora;
        }

    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {

        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }

    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int segundo) {

        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }

    }

    public int getSegundo() {
        return segundo;
    }

    public String imprimi() {
        return hora + " : " + minuto + " : " + segundo;

    }
}
