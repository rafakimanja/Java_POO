package br.com.alura.soundwave.modelos;

import br.com.alura.soundwave.classificacao.Classificavel;

public class Podcast extends Audio implements Classificavel {
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return this.apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        }else {
            return 7;
        }
    }
}
