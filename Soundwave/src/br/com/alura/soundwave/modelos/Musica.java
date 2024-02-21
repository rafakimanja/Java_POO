package br.com.alura.soundwave.modelos;

import br.com.alura.soundwave.classificacao.Classificavel;

public class Musica extends Audio implements Classificavel {
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return this.cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000){
            return 10;
        }else {
            return 6;
        }
    }
}
