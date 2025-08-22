package entities;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("==== Extrato Conta Corrent ====\n");
        super.imprimirExtrato();
    }
}
