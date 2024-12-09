import static org.junit.Assert.*;
import org.junit.Test;

public class ControleTest {

    @Test
    public void testEmprestarAlunoInexistente() {
        Controle controle = new Controle();
        int[] codigosLivros = {1, 2, 3};
        assertFalse("Aluno inexistente deveria impedir o empréstimo", controle.emprestar("10", codigosLivros, 3));
    }

    @Test
    public void testEmprestarAlunoComDebito() {
        Controle controle = new Controle();
        int[] codigosLivros = {1, 2, 3};
        assertFalse("Aluno com débito deveria impedir o empréstimo", controle.emprestar("4", codigosLivros, 3));
    }

    @Test
    public void testEmprestarComLivrosValidos() {
        Controle controle = new Controle();
        int[] codigosLivros = {1, 2};
        assertTrue("Empréstimo deveria ser possível com livros válidos", controle.emprestar("123", codigosLivros, 2));
    }

    @Test
    public void testEmprestarSemLivrosValidos() {
        Controle controle = new Controle();
        int[] codigosLivros = {3, 3, 3};
        assertFalse("Empréstimo deveria falhar sem livros válidos", controle.emprestar("123", codigosLivros, 3));
    }
}
