package projetojava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import projetojava.Banco.SaldoInsuficiente;

public class BancoTeste {
    Banco banco;

    @BeforeEach
    public void setUp() {
        banco = new Banco();
    }

    @Test
    public void testeSaque() throws SaldoInsuficiente {
        assertEquals(banco.getSaldo() - 50, banco.saque(50));
        assertEquals(banco.getSaldo() - 50, banco.saque(50));
        assertThrows(Banco.SaldoInsuficiente.class, () -> banco.saque(200));
    }
}
