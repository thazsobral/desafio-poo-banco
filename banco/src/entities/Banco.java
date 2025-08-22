package entities;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Conta> contas = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public Conta abrirContaCorrente(Cliente cliente) {
        Conta conta = new ContaCorrente(cliente);
        this.inserirCliente(cliente);
        this.inserirConta(conta);
        return conta;
    }

    public Conta abrirContaPoupanca(Cliente cliente) {
        Conta conta = new ContaPoupanca(cliente);
        this.inserirCliente(cliente);
        this.inserirConta(conta);
        return conta;
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Conta> getContas() {
        return this.contas;
    }

    public void inserirConta(Conta conta) {
        this.contas.add(conta);
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }
    
    public void inserirCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
}
