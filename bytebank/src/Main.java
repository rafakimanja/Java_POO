public class Main {
    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        minhaConta.saldo = 100;

        boolean retirada = minhaConta.saca(34.50);

        System.out.println("Conseguiu sacar ? " + retirada);
        System.out.println("Saldo atual: " + minhaConta.saldo);


        Conta contaDoBruno = new Conta();

        if(minhaConta.transfere(50, contaDoBruno)){
            System.out.println("Transferência feita com sucesso");
        }else{
            System.out.println("Transferência falhou");
        }
    }
}