package projetojava;

public class BancoTeste {
    Banco banco;

    
    @Test
    public void testeSaque() {
        assertEquals(100, banco.saque(100));
    }
}
