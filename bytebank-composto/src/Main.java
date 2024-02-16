public class Main {
    public static void main(String[] args) {

        Conta contaDoPedro = new Conta();

        contaDoPedro.titular = new Cliente();
        System.out.println(contaDoPedro.titular);

        contaDoPedro.titular.nome = "Pedro Henrique";
        System.out.println(contaDoPedro.titular.nome);
    }
}