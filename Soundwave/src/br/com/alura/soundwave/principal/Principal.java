package br.com.alura.soundwave.principal;

import br.com.alura.soundwave.modelos.MinhasPreferidas;
import br.com.alura.soundwave.modelos.Musica;
import br.com.alura.soundwave.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        
        Musica novaMusica = new Musica();
        novaMusica.setTitulo("Morado");
        novaMusica.setCantor("J. Balvin");

        for (int i = 0; i < 10000; i++) {
            novaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            novaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow Podcast");
        meuPodcast.setApresentador("Igor 3K");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 100; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(novaMusica);
        preferidas.inclui(meuPodcast);
    }
}
