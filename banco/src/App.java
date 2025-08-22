import entities.Banco;
import entities.Cliente;
import entities.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco("Meu banco");

        Cliente clienteA = new Cliente("Joaquim");
        Cliente clienteB = new Cliente("Joseph");

        Conta contaCorrente = banco.abrirContaCorrente(clienteA);
        Conta contaPoupanca = banco.abrirContaPoupanca(clienteB);

        contaCorrente.depositar(1000);
        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        
    }
}
