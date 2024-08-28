package exercicio01;

public class Livro {
    public String titulo;
    public String autor;
    public Integer numeroDePaginas;

    private Boolean aberto = false;
    private Integer pagAtual = 1;
    private Boolean concluido = false ;

    public Livro(String titulo, String autor, Integer numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void abrirLivro() {
        this.aberto = true;
    }

    public Integer getPaginaAtual(Integer pagina) {
        return this.pagAtual;
    }

    public void lerPagina(Integer pagina){

        if (pagAtual.equals(numeroDePaginas)) {
            concluido = true;
        } else {
            this.pagAtual++;
        }
    }

    public Boolean getLivroAberto() {
        return aberto;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
    }

}
