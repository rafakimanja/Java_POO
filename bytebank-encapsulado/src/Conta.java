public class Conta {
    private double saldo;
    private int agencia;
    private int numero_conta;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero_conta){
        total++;
        this.agencia = agencia;
        this.numero_conta = numero_conta;
        System.out.println("Estou criando um objeto");
        System.out.println("O total de contas é: "+Conta.total);
    }

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor){

        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){

       if(this.saldo >= valor){
           this.saldo -= valor;
           destino.deposita(valor);
           return true;
       }
       return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero_conta() {
        return this.numero_conta;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}
