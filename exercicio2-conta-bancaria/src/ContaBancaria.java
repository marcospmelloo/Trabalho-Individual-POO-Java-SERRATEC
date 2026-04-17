public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private int contSaque = 0;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo + 50.0;
    }

    public void depositar(double deposito){
        if(deposito <= 0){
            System.out.println("Seu depósito deve iniciar com um valor maior que zero!");
        }
        else {
            saldo += deposito;
            System.out.println("Depósito realizado com sucesso!");
        }
    }

    public boolean sacar(double saque){
        if(contSaque >= 3) {
            System.out.println("Operação inválida! Limite de saques diários atingido!");
            return false;
        }
        if(saque > 1000.0){
            System.out.println("Você não pode sacar mais que R$1000.00");
            return false;
        }
        if(saque > saldo){
            System.out.println("Saldo insuficiente!");
            return false;
        }

        saldo -= saque;
        contSaque++;
        System.out.println("Saque realizado com sucesso!");
        return true;
    }

    @Override
    public String toString() {
        return "Número da conta: " + numero +
                ", Titular: " + titular +
                ", Saldo : R$" + saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    }
