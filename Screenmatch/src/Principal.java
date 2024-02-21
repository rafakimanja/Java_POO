import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Serie newSerie = new Serie();

        newSerie.setNome("Broklyn 99");
        newSerie.setTemporadas(9);
        newSerie.setEpisodiosPorTemporada(20);
        newSerie.setMinutosPorEpisodio(25);

        System.out.println(newSerie.getDuracaoEmMinutos());
    }
}
