public abstract class Conta {
    private static int SEQUENCIAL = 1;

    protected int numero;
    protected Cliente cliente;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor);

    public void imprimirExtrato() {
        System.out.printf("Titular: %s\nConta: %d\nSaldo: %.2f\n", cliente.getNome(), numero, saldo);
    }
}
