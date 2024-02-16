public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(34, 875);

        System.out.println("Agencia: "+conta.getAgencia());
        System.out.println("Conta: "+conta.getNumero_conta());

        System.out.println(Conta.getTotal());

    }
}