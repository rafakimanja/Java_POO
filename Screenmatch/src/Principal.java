import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

//        Serie newSerie = new Serie();
//
//        newSerie.setNome("Broklyn 99");
//        newSerie.setTemporadas(9);
//        newSerie.setEpisodiosPorTemporada(20);
//        newSerie.setMinutosPorEpisodio(25);
//
//        System.out.println(newSerie.getDuracaoEmMinutos());

        Filme filme1 = new Filme();

        filme1.setNome("Pantera Negra");
        filme1.setAnoDeLancamento(2018);
        filme1.setDuracaoEmMinutos(135);
        filme1.avalia(7.5);
        filme1.avalia(8.2);
        filme1.avalia(9);
        System.out.println("Classificação de "+filme1.getNome()+": "+filme1.getClassificacao());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(filme1);
    }
}
