package exercicio03;

public class Pessoa {

    public String nome;
    public Integer idade;
    public Double altura;

    Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void printPessoa(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
