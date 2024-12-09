import static org.junit.Assert.*;
import org.junit.Test;

public class LivroTest {

    @Test
    public void testVerPrazo() {
        Livro livro = new Livro(2);
        assertEquals("Esperava que o prazo fosse 3 dias", 3, livro.verPrazo());
    }

    @Test
    public void testVerificaLivroValido() {
        Livro livro = new Livro(1);
        assertFalse("Esperava que o livro fosse válido", livro.verificaLivro());
    }

    @Test
    public void testVerificaLivroReservado() {
        Livro livro = new Livro(3);
        assertTrue("Esperava que o livro estivesse reservado", livro.verificaLivro());
    }
}
