import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970, 180);

        meuFilme.avalia(8);
        meuFilme.avalia(7.5);
        meuFilme.avalia(10);
        meuFilme.exibeFichaTecnica();

        System.out.println(meuFilme.pegaMedia());
        System.out.println("Total de avaliações: "+meuFilme.getTotalAvaliacoes());

    }
}
