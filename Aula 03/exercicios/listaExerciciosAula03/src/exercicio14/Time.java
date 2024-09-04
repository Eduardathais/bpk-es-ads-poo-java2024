package exercicio14;

import java.util.ArrayList;

public class Time {

    private String nome;
    private String tecnico;
    private ArrayList<String> jogadores;

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(String jogador) {
        if (!jogadores.contains(jogador)) {
            jogadores.add(jogador);
            System.out.println("Jogador '" + jogador + "' adicionado ao time '" + nome + "'.");
        } else {
            System.out.println("Jogador '" + jogador + "' já está no time '" + nome + "'.");
        }
    }

    public void removerJogador(String jogador) {
        if (jogadores.remove(jogador)) {
            System.out.println("Jogador '" + jogador + "' removido do time '" + nome + "'.");
        } else {
            System.out.println("Jogador '" + jogador + "' não está no time '" + nome + "'.");
        }
    }

    public int getNumeroDeJogadores() {
        return jogadores.size();
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", numeroDeJogadores=" + getNumeroDeJogadores() +
                ", jogadores=" + jogadores +
                '}';
    }
}
