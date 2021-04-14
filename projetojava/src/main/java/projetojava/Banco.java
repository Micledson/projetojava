package projetojava;

public class Banco {
    private double saldo = 100;

    public double saque(double valor) {
        
        setSaldo(getSaldo() - valor);

        return getSaldo();
    }


    private double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double valor) {
        this.saldo = valor;
    }
}
