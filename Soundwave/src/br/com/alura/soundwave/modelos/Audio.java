package br.com.alura.soundwave.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void curtir(){
        this.totalCurtidas++;
        System.out.println(this.titulo+" curtido!");
    }

    public void reproduzir(){
        this.totalReproducoes++;
        System.out.println("Reproduzindo "+this.titulo);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return this.totalReproducoes;
    }

    public int getTotalCurtidas() {
        return this.totalCurtidas;
    }

    public int getClassificacao() {
        return this.classificacao;
    }
}
