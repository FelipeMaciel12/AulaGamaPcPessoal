package exercicios.exercicio04;

public class EbookApp {
    public static void main(String[] args) {
       
        
        Ebook livro = new Ebook("Anjos&Demonios","Dan Brown", 320, 35);
        System.out.println("Titulo do Ebook: "+livro.titulo);
        System.out.println("Autor do Ebook: "+livro.autor);
        livro.mostrarCapa();
        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        livro.retrocederPagina();
        System.out.println("Página Atual: "+livro.exibirPagina());
        livro.irParaPagina(150);
        System.out.println("Página Atual: "+livro.exibirPagina());
        livro.retrocederPagina();
        livro.retrocederPagina();
        System.out.println("Página Atual: "+livro.exibirPagina());     
        

    }
}
