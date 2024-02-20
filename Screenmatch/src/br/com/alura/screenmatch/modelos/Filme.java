package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("nome do filme: "+this.nome);
        System.out.println("Ano de Lançamento: "+this.anoDeLancamento);
        System.out.println("Duração em Minutos: "+this.duracaoEmMinutos);
        System.out.println("Soma das Avaliações: "+this.somaDasAvaliacao);
        System.out.println("Totoal de Avaliações: "+this.totalAvaliacoes);
    }

    public void avalia(double somaDasAvaliacao) {
        this.somaDasAvaliacao += somaDasAvaliacao;
        this.totalAvaliacoes++;
    }

    public double pegaMedia(){
        return this.somaDasAvaliacao/this.totalAvaliacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacao() {
        return this.somaDasAvaliacao;
    }

    public void setSomaDasAvaliacao(double somaDasAvaliacao) {
        this.somaDasAvaliacao = somaDasAvaliacao;
    }

    public int getTotalAvaliacoes() {
        return this.totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
