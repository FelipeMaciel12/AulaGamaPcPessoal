package exercicios.exercicio04;

public class Ebook {
    // inserir atriutos
    public String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas, int paginaAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
    }

    public void avancarPagina() {

        if (paginaAtual >= 0 && paginaAtual < totalPaginas) {
            this.paginaAtual++;
        }

    }

    public void retrocederPagina() {

        if (paginaAtual > 0 && paginaAtual <= totalPaginas) {
            this.paginaAtual--;
        }

    }

    public void irParaPagina(int paginaAtual) {
        if(paginaAtual>=0 && paginaAtual<=totalPaginas){
            this.paginaAtual = paginaAtual;
        }
        
    }

    public int exibirPagina() {

        return paginaAtual;
    }

    public void mostrarCapa() {
        this.paginaAtual = 0;
        System.out.println("Capa do Ebook: " + this.paginaAtual);
    }

}
