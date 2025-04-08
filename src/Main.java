public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel");
        Conta cc = new ContaCorrente(cliente, 200);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.sacar(250);
        cc.imprimirExtrato();

        cp.depositar(300);
        cp.sacar(350);
        cp.imprimirExtrato();
    }
}
