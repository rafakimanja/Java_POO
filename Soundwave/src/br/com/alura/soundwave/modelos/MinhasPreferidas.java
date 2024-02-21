package br.com.alura.soundwave.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() > 7){
            System.out.println(audio.getTitulo() + " esta no seu Top 5 musicas preferidas!");
        }else {
            System.out.println(audio.getTitulo() + " é uma boa opção!");
        }
    }
}
