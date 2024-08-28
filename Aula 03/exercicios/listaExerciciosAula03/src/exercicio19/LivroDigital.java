package exercicio19;

public class LivroDigital {

    private String titulo;
    private String autor;
    private double tamanhoArquivo;
    private boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
        this.aberto = false;
    }

    public void abrir() {
        if (!aberto) {
            aberto = true;
            System.out.println(titulo + " está aberto.");
        } else {
            System.out.println( titulo + " já está aberto.");
        }
    }

    public void fechar() {
        if (aberto) {
            aberto = false;
            System.out.println( titulo + " foi fechado.");
        } else {
            System.out.println( titulo + " já está fechado.");
        }
    }

    @Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tamanhoArquivo=" + tamanhoArquivo + " MB" +
                ", aberto=" + (aberto ? "Sim" : "Não") +
                '}';
    }
}
