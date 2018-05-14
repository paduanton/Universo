package br.com.universo;

public abstract class Criatura {
    private String nome;

    public final void setNome(String nome) {
        if (nome.equalsIgnoreCase("deus")) {
            throw new IllegalArgumentException("Nao deveras possuir meu nome!");
        }
        this.nome = nome;
    }

    public final String getNome() {
        return this.nome;
    }
}
