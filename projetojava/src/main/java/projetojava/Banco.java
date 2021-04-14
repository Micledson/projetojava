package projetojava;

public class Banco {
    private double saldo = 100;

    public class SaldoInsuficiente extends Exception{
        private static final long serialVersionUID = 1L;
    }

    public double saque(double valor) throws SaldoInsuficiente {
        
        if(getSaldo() < valor) {
            throw new SaldoInsuficiente();
        }

        setSaldo(getSaldo() - valor);

        return getSaldo();
    }

    public double deposito(double valor) {
        
        setSaldo(getSaldo() + valor);


        return getSaldo();
    }


    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double valor) {
        this.saldo = valor;
    }
}
