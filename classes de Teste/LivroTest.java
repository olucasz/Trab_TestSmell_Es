import static org.junit.Assert.*;
import org.junit.Test;

public class LivroTest {

    @Test
    public void testVerPrazo() {
        Livro livro = new Livro(2);
        assertEquals("Prazo calculado incorretamente", 3, livro.verPrazo());
    }

    @Test
    public void testVerificaLivroValido() {
        Livro livro = new Livro(1);
        assertFalse("Livro válido foi considerado inválido", livro.verificaLivro());
    }

    @Test
    public void testVerificaLivroReservado() {
        Livro livro = new Livro(3);
        assertTrue("Livro reservado foi considerado válido", livro.verificaLivro());
    }
}
