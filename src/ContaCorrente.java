public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(Cliente cliente, double limite) {
        super(cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou limite excedido!");
        }
    }
}
