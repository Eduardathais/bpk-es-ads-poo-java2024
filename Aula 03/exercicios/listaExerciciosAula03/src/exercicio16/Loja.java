package exercicio16;

public class Loja {

    private String nome;
    private String endereco;
    private String telefone;
    private boolean aberta;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.aberta = false;
    }

    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println(nome + " está agora aberta.");
        } else {
            System.out.println( nome + " já está aberta.");
        }
    }

    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println(nome + " foi fechada.");
        } else {
            System.out.println( nome + " já está fechada.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", aberta=" + (aberta ? "Sim" : "Não") +
                '}';
    }
}
