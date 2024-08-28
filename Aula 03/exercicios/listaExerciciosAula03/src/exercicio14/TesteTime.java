package exercicio14;

public class TesteTime {
    public static void main(String[] args) {
        Time internacional = new Time("Internacional", "Mano Menezes");

        internacional.adicionarJogador("Alan Patrick");
        internacional.adicionarJogador("Taison");
        internacional.adicionarJogador("Edenilson");
        internacional.adicionarJogador("Thiago Galhardo");
        internacional.adicionarJogador("Patrick");

        System.out.println(internacional);

        internacional.removerJogador("Thiago Galhardo");

        internacional.removerJogador("Rodrigo Dourado");

        System.out.println(internacional);
    }
}
