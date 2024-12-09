import static org.junit.Assert.*;
import org.junit.Test;

public class ControleTest {

    private static final int[] LIVROS_VALIDOS = {1, 2};
    private static final int[] LIVROS_INVALIDOS = {3, 3, 3};
    private static final String ALUNO_VALIDO = "123";
    private static final String ALUNO_INEXISTENTE = "10";
    private static final String ALUNO_COM_DEBITO = "4";

    @Test
    public void testEmprestarAlunoInexistente() {
        Controle controle = new Controle();
        assertFalse("Esperava que empréstimos para alunos inexistentes fossem negados",
                    controle.emprestar(ALUNO_INEXISTENTE, LIVROS_VALIDOS, LIVROS_VALIDOS.length));
    }

    @Test
    public void testEmprestarAlunoComDebito() {
        Controle controle = new Controle();
        assertFalse("Esperava que empréstimos para alunos com débito fossem negados",
                    controle.emprestar(ALUNO_COM_DEBITO, LIVROS_VALIDOS, LIVROS_VALIDOS.length));
    }

    @Test
    public void testEmprestarComLivrosValidos() {
        Controle controle = new Controle();
        assertTrue("Esperava que empréstimos com livros válidos fossem realizados",
                   controle.emprestar(ALUNO_VALIDO, LIVROS_VALIDOS, LIVROS_VALIDOS.length));
    }

    @Test
    public void testEmprestarSemLivrosValidos() {
        Controle controle = new Controle();
        assertFalse("Esperava que empréstimos sem livros válidos fossem negados",
                    controle.emprestar(ALUNO_VALIDO, LIVROS_INVALIDOS, LIVROS_INVALIDOS.length));
    }
}
