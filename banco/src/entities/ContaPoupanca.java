package entities;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("==== Extrato Conta Poupanca ====\n");
        super.imprimirExtrato();
    }
}
